package com.ishan.coinhandler;

import com.ishan.Coin;

import java.util.List;

public class NickelCoinHandler extends ReturnCoinHandler {
    @Override
    public void returnCoin(int amount, List<Coin> coins) {
        int numberOfCoins = amount / 5;
        int remainder = amount % 5;

        if (numberOfCoins > 0) {
            System.out.println("Returning " + numberOfCoins + " nickel coins with value " + Coin.NICKEL.getValue() + " each");
            while (numberOfCoins > 0) {
                coins.add(Coin.NICKEL);
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
