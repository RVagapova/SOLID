public class Buyer extends PersonImpl {
    //выполняется принцип single responsibility путем создания отдельного класса для хранения данных о покупателе
    public Buyer(String name, String email, int budget) {
        super(name, email, budget);
    }


}
