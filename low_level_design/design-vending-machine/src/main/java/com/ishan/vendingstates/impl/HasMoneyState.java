package com.ishan.vendingstates.impl;

import com.ishan.Coin;
import com.ishan.Item;
import com.ishan.VendingMachine;
import com.ishan.vendingstates.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Currently Vending machine is in " + this.getClass().getSimpleName());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        // from Has Money state we can go to SelectionState when user clicks on start product selection button
        machine.setVendingMachineState(new ProductSelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin: " + coin.name() + " with value " + coin.getValue() + " and added to the Coin Tray");
        machine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You need to click on start product selection button first.");
    }

    @Override
    public int getChange(VendingMachine machine, int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in HasMoney State");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not be dispensed in HasMoney State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        List<Coin> coinList = machine.getCoinList();
        machine.setVendingMachineState(new IdleState(machine));
        return coinList;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You can not update inventory in HasMoney State");
    }
}

