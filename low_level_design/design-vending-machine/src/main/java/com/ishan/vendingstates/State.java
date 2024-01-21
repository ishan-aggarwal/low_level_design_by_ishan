package com.ishan.vendingstates;

import com.ishan.Coin;
import com.ishan.Item;
import com.ishan.VendingMachine;

import java.util.List;

public interface State {

    void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    int getChange(VendingMachine machine, int returnChangeMoney) throws Exception;

    Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;


}

