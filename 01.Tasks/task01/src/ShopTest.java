import java.util.List;
import org.assertj.core.api.Assertions;

public class ShopTest {

    public static void main(String[] args) {
        Product notebook = new Product();
        notebook.setTitle("Ноутбук");
        notebook.setCost(50000);
        Product monitor = new Product();
        monitor.setTitle("Монитор");
        monitor.setCost(20000);
        Product mouse = new Product();
        mouse.setTitle("Мышь");
        mouse.setCost(200);
        Product keyboard = new Product();
        keyboard.setTitle("Клавиатура");
        keyboard.setCost(500);
        Product block = new Product();
        block.setTitle("Системный блок");
        block.setCost(55000);
        
        Shop oldi = new Shop();
        oldi.setProducts(List.of(notebook, monitor, mouse, keyboard, block));
        // Вывод всех продуктов:
        //oldi.getProducts().forEach(product -> System.out.println("Название: " + product.getTitle() + ", Цена: " + product.getCost()));
        // Сортировка продуктов по возрастанию:
        // oldi.sortProductsByPrice().forEach(product -> System.out.println(product.getTitle() + " " + product.getCost()));
        // Вывод самого дорого продукта:
        //System.out.println("Самый дорогой продукт: " + oldi.getMostExpensiveProduct().getTitle()+", цена: " + oldi.getMostExpensiveProduct().getCost());
        testSetProducts();
        testGetMostExpensiveProduct();
        testSortProductsByPrice();
    }


// 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    public static void testSetProducts() {
        Product notebook = new Product();
        notebook.setTitle("Ноутбук");
        notebook.setCost(50000);
        Product monitor = new Product();
        monitor.setTitle("Монитор");
        monitor.setCost(20000);

        Shop oldi = new Shop();
        oldi.setProducts(List.of(notebook, monitor));

        Assertions.assertThat(oldi.getProducts()).hasSize(2)
                .containsExactlyInAnyOrder(notebook, monitor);
    }
// 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    public static void testGetMostExpensiveProduct() {
        Product notebook = new Product();
        notebook.setTitle("Ноутбук");
        notebook.setCost(50000);
        Product monitor = new Product();
        monitor.setTitle("Монитор");
        monitor.setCost(20000);

        Shop oldi = new Shop();
        oldi.setProducts(List.of(notebook, monitor));

        Assertions.assertThat(oldi.getMostExpensiveProduct()).isEqualTo(notebook);
    }

// 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
    public static void testSortProductsByPrice() {
        Product notebook = new Product();
        notebook.setTitle("Ноутбук");
        notebook.setCost(50000);
        Product monitor = new Product();
        monitor.setTitle("Монитор");
        monitor.setCost(20000);
        Product mouse = new Product();
        mouse.setTitle("Мышь");
        mouse.setCost(200);
        Product keyboard = new Product();
        keyboard.setTitle("Клавиатура");
        keyboard.setCost(500);
        Product block = new Product();
        block.setTitle("Системный блок");
        block.setCost(55000);

        Shop oldi = new Shop();
        oldi.setProducts(List.of(notebook, monitor, mouse, keyboard, block));

        List<Product> sortedProducts = oldi.sortProductsByPrice();

        Assertions.assertThat(sortedProducts).hasSize(5)
                .containsExactly(mouse, keyboard, monitor, notebook, block);
    }

}
