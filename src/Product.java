public interface Product {
    //интерфейс Product реализует принцип open-closed principle. Он дает возможность расширять магазин
    //Например, пока в магазине есть только пищевые продукты, далее можно добавить класс с продукцией другого типа

    //Dependency inversion principle  задан данным инерфейсом и необходимым количеством абстрактных методов
    public boolean hasProduct(String nameProduct);

    public void range();
    public void addProduct(String nameProduct, int countOfProduct, int price);
    public Food find (String name);
}
