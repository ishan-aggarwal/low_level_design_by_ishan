package com.ishan.coinhandler;

import com.ishan.Coin;

import java.util.ArrayList;
import java.util.List;

public class QuarterCoinHandler extends ReturnCoinHandler {
    @Override
    public void returnCoin(int amount, List<Coin> coins) {
        int numberOfCoins = amount / 25;
        int remainder = amount % 25;

        if (numberOfCoins > 0) {
            System.out.println("Returning " + numberOfCoins + " quarter coins with value " + Coin.QUARTER.getValue() + " each");
            while (numberOfCoins > 0) {
                coins.add(Coin.QUARTER);
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
