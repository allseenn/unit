import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        List<Product> tempList = new LinkedList<>(products);
        List<Product> sortedList = new LinkedList<>();

        while (!tempList.isEmpty()) {
            int minValue = Integer.MAX_VALUE;
            Product minProduct = null;
            for (Product product : tempList) {
                if (product.getCost() < minValue) {
                    minValue = product.getCost();
                    minProduct = product;
                }
            }
            sortedList.add(minProduct);
            tempList.remove(minProduct);
        }

        return sortedList;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getCost() > maxValue){
                maxValue = this.products.get(i).getCost();
                maxIndex = i;
            }
        }
        return this.products.get(maxIndex);
    }
}

