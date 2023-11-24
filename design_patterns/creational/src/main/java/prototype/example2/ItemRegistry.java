package prototype.example2;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private static final Map<String, Item> items = new HashMap<>();

    public ItemRegistry() {
        loadItems();
    }

    public static Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie("Basic Movie", 24.99, 120);
        items.put("Movie", movie);

        Book book = new Book("Basic Book", 19.99, "John Doe");
        items.put("Book", book);
    }
}
