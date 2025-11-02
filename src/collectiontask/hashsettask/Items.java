package collectiontask.hashsettask;

import java.util.ArrayList;
import java.util.Arrays;

//служебный класс, предоставляющий коллекцию нужного размера
public class Items {
    private int itemNumber;
    private final String[] items = {
            "ball",
            "rocket",
            "bottle",
            "sock",
            "ticket",
            "lid",
            "ink",
            "pencil",
            "book",
            "canvas",
            "ink",
            "ticket",
            "car",
            "phone"
    };

    public Items() {
        this.itemNumber = 0;
    }

    public ArrayList<String> getBound(int size) {
        String[] bound = new String[size];
        System.arraycopy(items, 0, bound, 0, size);
        itemNumber = size;
        return new ArrayList<>(Arrays.asList(bound));
    }

    public int getVolume() {
        return items.length - itemNumber;
    }

    public String getItem() {
        String item = items[itemNumber];
        itemNumber++;
        return item;
    }

    public boolean isEmpty() {
        return itemNumber == items.length;
    }
}
