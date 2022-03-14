
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();

    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {

        if ((totalWeight()) + item.getWeight() <= maxWeight) {
            items.add(item);
        } else {
            return;
        }

    }

    public int totalWeight() {
        int weight = 0;

        for (Item e : items) {
            weight += e.getWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Item e : items) {
            System.out.println(e);
        }
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item e : items) {
            if (e.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = e;
            }
        }
        return heaviestItem;
    }

    public String toString() {
        String weightOutput = " (" + totalWeight() + "kg)";
        String itemOutput = "";

        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }

}
