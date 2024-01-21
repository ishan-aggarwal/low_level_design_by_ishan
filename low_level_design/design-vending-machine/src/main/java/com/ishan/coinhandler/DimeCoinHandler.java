package com.ishan.coinhandler;

import com.ishan.Coin;

import java.util.List;

public class DimeCoinHandler extends ReturnCoinHandler {
    @Override
    public void returnCoin(int amount, List<Coin> coins) {
        int numberOfCoins = amount / 10;
        int remainder = amount % 10;

        if (numberOfCoins > 0) {
            System.out.println("Returning " + numberOfCoins + " dime coins with value " + Coin.DIME.getValue() + " each");
            while (numberOfCoins > 0) {
                coins.add(Coin.DIME);
                numberOfCoins--;
            }
        }

        if (remainder != 0) {
            next.returnCoin(remainder, coins);
        }
    }

    @Override
    public ReturnCoinHandler setNextHandler(ReturnCoinHandler handler) {
        this.next = handler;
        return this.next;
    }
}
