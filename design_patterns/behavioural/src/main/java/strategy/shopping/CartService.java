package strategy.shopping;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    private final List<Item> itemList;

    public CartService() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public List<Item> getItemList() {
        return this.itemList;
    }

    public List<String> getItemNames() {
        List<String> itemNames = new ArrayList<>();
        for (Item item : this.itemList) {
            itemNames.add(item.getName());
        }
        return itemNames;
    }
}
