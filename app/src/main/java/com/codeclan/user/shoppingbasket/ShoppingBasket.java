package com.codeclan.user.shoppingbasket;


import java.util.ArrayList;

/**
 * Created by user on 09/06/2017.
 */

class ShoppingBasket {
    private ArrayList<Item> listOfItems;

    public int countItems() {
        listOfItems = new ArrayList<>();
        return this.listOfItems.size();
    }

    public void addItem(Item item) {
        this.listOfItems.add(item);
    }
}
