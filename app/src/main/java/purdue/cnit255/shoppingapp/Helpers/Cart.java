package purdue.cnit255.shoppingapp.Helpers;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> items =  new ArrayList<Product>();
    Customer user;

    public Cart(Customer user){
        this.user = user;
    }

    public void addItem(Product product){
        items.add(product);
    }

    public ArrayList getCart(){
        return this.items;
    }
}
