package com.ishan;

import com.ishan.coinhandler.*;
import com.ishan.vendingstates.State;
import com.ishan.vendingstates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private State vendingMachineState;
    private final InventoryService inventoryService;
    private List<Coin> coinList;
    private final ReturnCoinHandler returnCoinHandler;

    public VendingMachine() {
        // initially vending machine is in idle state
        vendingMachineState = new IdleState();
        // initialize inventory service while creating vending machine
        inventoryService = new InventoryService();
        // coin list is empty initially and is used to store the coins inserted by the user
        coinList = new ArrayList<>();

        returnCoinHandler = new QuarterCoinHandler();
        DimeCoinHandler dimeCoinHandler = new DimeCoinHandler();
        NickelCoinHandler nickelCoinHandler = new NickelCoinHandler();
        PennyCoinHandler pennyCoinHandler = new PennyCoinHandler();

        returnCoinHandler.setNextHandler(dimeCoinHandler)
                .setNextHandler(nickelCoinHandler)
                .setNextHandler(pennyCoinHandler);

    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public InventoryService getInventoryService() {
        return inventoryService;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public ReturnCoinHandler getReturnCoinHandler() {
        return returnCoinHandler;
    }
}

