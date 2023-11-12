import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements Product {
    public List<Food> listOfFood = new ArrayList<>();

    @Override
    public boolean hasProduct(String nameProduct) {
        if(!listOfFood.isEmpty()) {
        for (Food food : listOfFood) {
            if (food.getName().equals(nameProduct)) {
                return true;
            }
        }
        } else {
            System.out.println("продукт не найден");
        }
        return false;
    }

    @Override
    public void range() {
        for (Food food : listOfFood) {
            System.out.println("в наличии есть:");
            System.out.println(food.toString());
        }
    }

    @Override
    public void addProduct(String nameProduct, int countOfProduct, int price) {
        if (listOfFood.isEmpty()) {
            listOfFood.add(new Food(nameProduct, countOfProduct, price));
        } else {
            for (Food food : listOfFood) {
                if (hasProduct(food.getName())) {
                    countOfProduct += food.getCount();
                    food.setCount(countOfProduct);
                } else {
                    listOfFood.add(new Food(nameProduct, countOfProduct, price));
                }
            }
        }
    }

    @Override
    public Food find(String name) {
        if (hasProduct(name)) {
            for (Food food: listOfFood) {
                if (food.getName().equals(name)) {
                    return food;
                }
            }
        }
        return null;
    }
}
