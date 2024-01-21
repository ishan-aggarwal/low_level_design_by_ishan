package com.ishan.vendingstates.impl;

import com.ishan.Coin;
import com.ishan.Item;
import com.ishan.VendingMachine;
import com.ishan.vendingstates.State;

import java.util.ArrayList;
import java.util.List;


public class ProductSelectionState implements State {

    public ProductSelectionState() {
        System.out.println("Currently Vending machine is in " + this.getClass().getSimpleName());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You can not click on insert coin button in ProductSelection State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can not insert Coin in ProductSelection State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {

        // 1. get item of this codeNumber
        Item item = machine.getInventoryService().getItem(codeNumber);
        System.out.println("You have selected item with code number: " + codeNumber + " and price: " + item.getPrice() + " and name: " + item.getType());

        // 2. total amount paid by User
        int totalAmountInsertedByUser = 0;
        for (Coin coin : machine.getCoinList()) {
            totalAmountInsertedByUser = totalAmountInsertedByUser + coin.getValue();
        }

        // 3. compare product price and amount paid by user
        if (totalAmountInsertedByUser < item.getPrice()) {
            System.out.println("Insufficient Amount added!!! Product you selected is for price: " + item.getPrice() + " and you paid: " + totalAmountInsertedByUser);
            List<Coin> coinsInsertedSoFar = refundFullMoney(machine);
            System.out.println("Returned the full amount back in the Coin Dispense Tray : " + coinsInsertedSoFar);
            throw new Exception("Insufficient Amount Added!!!");
        } else if (totalAmountInsertedByUser >= item.getPrice()) {
            if (totalAmountInsertedByUser > item.getPrice()) {
                getChange(machine, totalAmountInsertedByUser - item.getPrice());
            }
            // 4. update inventory and dispense product
            // change the state of the vending machine from ProductSelectionState to DispenseState
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(VendingMachine machine, int returnExtraMoney) throws Exception {
        //actual logic should be to return COINs in the dispense tray, but for simplicity i am just returning the amount to be refunded
        System.out.println("Total coin value to be returned: " + returnExtraMoney);
        List<Coin> coinsToBeReturned = new ArrayList<>();
        machine.getReturnCoinHandler().returnCoin(returnExtraMoney, coinsToBeReturned);
        System.out.println("Change coins returned in the Coin Dispense Tray: " + coinsToBeReturned);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        List<Coin> coinsInsertedSoFar = machine.getCoinList();
        machine.setVendingMachineState(new IdleState(machine));
        return coinsInsertedSoFar;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not be dispensed ProductSelection State");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in ProductSelection State");
    }
}

