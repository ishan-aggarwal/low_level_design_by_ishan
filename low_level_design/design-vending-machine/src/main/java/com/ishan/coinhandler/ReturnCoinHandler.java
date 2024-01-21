package com.ishan.coinhandler;

import com.ishan.Coin;

import java.util.List;

public abstract class ReturnCoinHandler {
    protected ReturnCoinHandler next = null;

    public abstract void returnCoin(int amount, List<Coin> coins);

    public abstract ReturnCoinHandler setNextHandler(ReturnCoinHandler handler);
}
