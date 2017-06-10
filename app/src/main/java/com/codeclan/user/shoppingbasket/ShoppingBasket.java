package com.codeclan.user.shoppingbasket;


import java.util.ArrayList;

/**
 * Created by user on 09/06/2017.
 */

class ShoppingBasket {
    private ArrayList<Item> listOfItems = new ArrayList<>();


    public int countItems() {
        return this.listOfItems.size();
    }

    public void addItem(Item item) {
        this.listOfItems.add(item);
    }

    public void removeItem(Item item) {
        this.listOfItems.remove(item);
    }

    public void clearAllItems() {
        this.listOfItems.clear();
    }

}
