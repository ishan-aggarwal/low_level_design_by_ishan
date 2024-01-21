package com.ishan;


import com.ishan.vendingstates.State;

/**
 * Main class to run the application for Vending Machine
 */
public class RunVendingMachineApp {
    public static void main(String[] args) {

        // create a vending machine object
        VendingMachine vendingMachine = new VendingMachine();
        try {

            System.out.println("|");
            System.out.println("Filling up the inventory in the vending machine");
            System.out.println("|");
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("Clicking on InsertCoinButton in the vending machine");
            System.out.println("|");

            // get the current state of the vending machine which is IdleState
            State vendingState = vendingMachine.getVendingMachineState();
            // click on the insert coin button so that we can insert the coin and order something from the vending machine
            vendingState.clickOnInsertCoinButton(vendingMachine);

            // get the current state of the vending machine which is HasMoneyState
            vendingState = vendingMachine.getVendingMachineState();
            // insert the coin in the vending machine
            vendingState.insertCoin(vendingMachine, Coin.NICKEL); // 5 cents
            vendingState.insertCoin(vendingMachine, Coin.QUARTER); // 25 cents
            // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

            System.out.println("|");
            System.out.println("Clicking on ProductSelectionButton in the vending machine");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            // get the current state of the vending machine which is ProductSelectionState
            vendingState = vendingMachine.getVendingMachineState();
            // choose the product from the vending machine
            vendingState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);
        } catch (Exception e) {
            displayInventory(vendingMachine);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventoryService().getItemShelves();
        // iterate over the slots and fill up the inventory
        for (int i = 0; i < slots.length; i++) {
            // create a new item for each slot
            Item newItem = new Item();
            if (i < 3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i < 5) {
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if (i < 7) {
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            } else if (i < 10) {
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventoryService().getItemShelves();
        for (ItemShelf slot : slots) {
            System.out.println("CodeNumber: " + slot.getCode() +
                    " Item: " + slot.getItem().getType().name() +
                    " Price: " + slot.getItem().getPrice() +
                    " isAvailable: " + !slot.isSoldOut());
        }
    }
}
