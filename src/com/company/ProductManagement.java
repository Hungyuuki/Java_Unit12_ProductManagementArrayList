package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductManagement {
    private ArrayList<Product> products = new ArrayList<>();

    public void displayAllProduct(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i+1) + "\t" + products.get(i));
        }
    }

    public void addNewProduct(int index, Product newProduct){
        this.products.add(index, newProduct);
    }

    public void updateProduct(int index, Product newProduct){
        this.products.set(index, newProduct);
    }

    public void removeProductById(int index){
        this.products.remove(index);
    }

    public void findProductByName(){

    }

    public void priceIncreasingSort(){
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(products, priceComparator);
        displayAllProduct();
    }
}
