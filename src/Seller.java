public class Seller extends PersonImpl{
    ProductImpl product = new ProductImpl();
    public Seller(String name, String email, int budget) {
        super(name, email, budget);
    }
    public void provideProducts (String name, int count, int price) {
        product.addProduct(name,count,price);
    }
}
