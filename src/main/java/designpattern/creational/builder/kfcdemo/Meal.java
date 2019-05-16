package designpattern.creational.builder.kfcdemo;

/**
 * Product（产品角色）
 * 一个具体的产品对象。
 */
public class Meal {
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
