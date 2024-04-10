package com.p7;

import java.util.HashSet;

public class product {
	private String productId;
    private String productName;

    public product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
   
    public static void main(String[] args) {
        HashSet<product> products = new HashSet<>();

        // Adding predefined product details
        products.add(new product("P001", "Maruti 800"));
        products.add(new product("P002", "Maruti Zen"));
        products.add(new product("P003", "Maruti Dezire"));
        products.add(new product("P004", "Maruti Alto"));

        // List all the product details
        System.out.println("Product details:");
        for (product product : products) {
            System.out.println(product);
        }}
    }
    