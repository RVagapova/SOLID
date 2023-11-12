import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements Person{
    private String name;
    private String email;
    private int budget;
    ProductImpl product = new ProductImpl();

    public PersonImpl(String name, String email, int budget) {
        this.name = name;
        this.email = email;
        this.budget = budget;
    }

    @Override
    public void buy(String nameProduct, int countOfProduct) {
        if (product.hasProduct(nameProduct)) {
            for (Food food : product.listOfFood) {
                if (countOfProduct > product.find(nameProduct).getCount()) {
                    System.out.println("в наличии только " + product.find(nameProduct).getCount());
                }
                else if (budget >= product.find(nameProduct).getPrice() * countOfProduct) {
                    product.find(nameProduct).setCount(product.find(nameProduct).getCount() - countOfProduct);
                    System.out.println("покупка прошла успешно");
                } else {
                    System.out.println("у Вас не достаточно средств");
                }
            }
        } else {
            System.out.println("Такого продукта нет в наличии");
        }
    }

    @Override
    public void range() {
        product.range();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBudget() {
        return budget;
    }
}
