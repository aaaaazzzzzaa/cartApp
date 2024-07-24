package main.java;

import java.util.Objects;

public class Product {
    private final String key;
    private final String name;
    private final int price;

    public Product(String key, String name, int price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Product product = (Product) obj;

        return price == product.price
                && Objects.equals(key, product.key)
                && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name, price);
    }
}
