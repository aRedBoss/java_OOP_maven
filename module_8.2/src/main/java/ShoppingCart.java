import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotal() {
        return items.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}

