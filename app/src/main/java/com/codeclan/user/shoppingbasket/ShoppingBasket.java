package com.codeclan.user.shoppingbasket;


import java.util.ArrayList;

/**
 * Created by user on 09/06/2017.
 */

class ShoppingBasket {
    public ArrayList<Item> listOfItems = new ArrayList<>();


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

    public double getTotalValue() {
        double totalValue = 0;
            for (Item item : this.listOfItems)

                totalValue += item.getValue();
        return totalValue;
    }

}
