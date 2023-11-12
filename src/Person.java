public interface Person {
    //выполняет функцию Interface Segregation Principle, отдельный интерфейс для продукции, отдельная для людей
    //в дальнейшем можно расширять, добавляя другие группы людей
    public void buy(String nameProduct, int countOfProduct);
    public void range();
}
