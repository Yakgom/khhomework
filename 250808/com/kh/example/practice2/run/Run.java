package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {
    public static void main(String[] args) {
        Product product = new Product();

        product.information();

        String name = "헤이즐넛커피";
        int price = 2500;
        String brand = "메가커피";

        product.setpName(name);
        product.setPrice(price);
        product.setBrand(brand);

        product.information();
    }
}
