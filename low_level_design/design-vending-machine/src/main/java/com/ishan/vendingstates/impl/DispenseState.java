package com.ishan.vendingstates.impl;

import com.ishan.Coin;
import com.ishan.Item;
import com.ishan.VendingMachine;
import com.ishan.vendingstates.State;

import java.util.List;

public class DispenseState implements State {

    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Vending machine is in " + this.getClass().getSimpleName());
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Insert coin button is disabled in Dispense State.");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Product Selection Button is disabled in Dispense State.");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Insert Coin button is disabled in Dispense State.");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Choose Product option is not available in Dispense State.");
    }

    @Override
    public int getChange(VendingMachine machine, int returnChangeMoney) throws Exception {
        throw new Exception("Change can not returned in Dispense State.");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Refund can not be made in Dispense State.");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed with code number: " + codeNumber);
        Item item = machine.getInventoryService().getItem(codeNumber);
        machine.getInventoryService().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Dispense State.");
    }
}

