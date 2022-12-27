/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import model.Product;

/**
 *
 * @author sonnt
 */
public class ProductDBContext {
    public ArrayList<Product> getProducts()
    {
        ArrayList<Product> products =  new ArrayList<>();
        Product cocacola = new Product();
        cocacola.setId(1);
        cocacola.setName("Cocacola");
        cocacola.setPrice(10);
        products.add(cocacola);
        
        Product pepsi = new Product();
        pepsi.setId(2);
        pepsi.setName("Pepsi");
        pepsi.setPrice(9.5f);
        products.add(pepsi);
        
        return products;
    }
    
    public Product get(int id)
    {
        ArrayList<Product> products = getProducts();
        for (Product product : products) {
            if(product.getId() == id)
                return product;
        }
        return null;
    }
}
