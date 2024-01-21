package com.ishan.vendingstates.impl;

import com.ishan.Coin;
import com.ishan.Item;
import com.ishan.VendingMachine;
import com.ishan.vendingstates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently Vending machine is in " + this.getClass().getSimpleName());
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending machine is in " + this.getClass().getSimpleName());
        // reset the coin list when vending machine is in idle state
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        // from Idle state we can go to HasMoneyState when user clicks on insert coin button
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("ProductSelectionButton is not enabled in Idle State. First you need to click on Insert Coin Button");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Insert Coin choice is not available in Idle State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Choose Product option is not possible in Idle State");
    }

    @Override
    public int getChange(VendingMachine machine, int returnChangeMoney) throws Exception {
        throw new Exception("Change can not be initiated in Idle State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Refund can not be made in Idle State");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not be dispensed in Idle State");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventoryService().addItem(item, codeNumber);
    }
}

