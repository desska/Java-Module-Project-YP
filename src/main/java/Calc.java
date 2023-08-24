import java.util.ArrayList;

public class Calc {

    Calc() {

        items = new ArrayList<Item>();

    }

    public void addItem(Item item) {

        items.add(item);

    }

    public String getItemsList() {

        StringBuilder builder = new StringBuilder();

        for (Item item : items) {
            builder.append(item.name);
            builder.append("\n");
        }
        return builder.toString();
    }

    public double getSum() {

        double sum = 0;
        for (Item item : items) {
            sum += item.price;
        }
        return sum;
    }

    public double distributedSum(double sum, int personsAmount) {

        return ((personsAmount > 0) ? sum / personsAmount : 0);

    }

    private ArrayList<Item> items;


}
