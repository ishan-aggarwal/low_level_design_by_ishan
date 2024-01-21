package com.ishan.coinhandler;

import com.ishan.Coin;

import java.util.List;

public class PennyCoinHandler extends ReturnCoinHandler {
    @Override
    public void returnCoin(int amount, List<Coin> coins) {
        int numberOfCoins = amount;
        if (numberOfCoins > 0) {
            System.out.println("Returning " + numberOfCoins + " penny coins with value " + Coin.PENNY.getValue() + " each");
            while (numberOfCoins > 0) {
                coins.add(Coin.PENNY);
                numberOfCoins--;
            }
        }
    }

    @Override
    public ReturnCoinHandler setNextHandler(ReturnCoinHandler handler) {
        this.next = handler;
        return this.next;
    }
}
