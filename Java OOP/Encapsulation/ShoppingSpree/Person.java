package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        try {
            if (product.getCost() <= this.money) {
                this.money -= product.getCost();
                this.products.add(product);
                System.out.println(this.name + " bought " + product.getName());

            } else {
                throw new IllegalArgumentException(String.format("%s can't afford %s", this.getName(), product.getName()));
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void setName(String name) {

            if (name == null || name.isEmpty() || name.isBlank()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            this.name = name;
    }

    private void setMoney(double money) {
            if (money < 0) {
                throw new IllegalArgumentException("Money cannot be negative");
            }
            this.money = money;

    }

    public String productsSummary() {
        if (this.products.isEmpty()) {
            return "Nothing bought";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            sb.append(products.get(i).getName());
            if (i < products.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }


}
