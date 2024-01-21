package com.ishan;

public class InventoryService {

    ItemShelf[] itemShelves;

    InventoryService() {
        itemShelves = new ItemShelf[10];
        initializeItemShelves(); // here we are just initializing each of the itemShelves and assigning code to each of them
    }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    private void initializeItemShelves() {
        int startCode = 101;
        for (int i = 0; i < itemShelves.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true); // reason for this is, we are not adding any item in the beginning
            itemShelves[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {

        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.item = item;
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for (ItemShelf itemShelf : this.itemShelves) {
            if (itemShelf.getCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("Item is already sold out");
                } else {
                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid Code entered by user.");
    }

    public void updateSoldOutItem(int codeNumber) {
        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.getCode() == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}

