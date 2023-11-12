public class Main {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Jon", "test@test.ru", 15000);
        Seller seller = new Seller("Иван", "fkj@kjjk.ru", 10000);
        ProductImpl product = new ProductImpl();
        product.addProduct("pasta", 15, 150);
        product.range();
        buyer1.buy("oil", 5);
    }
}