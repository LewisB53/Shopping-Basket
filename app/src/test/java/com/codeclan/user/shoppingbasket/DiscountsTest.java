package com.codeclan.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/06/2017.
 */

public class DiscountsTest {

    ShoppingBasket shoppingBasket;
    Item item1;
    Item item2;
    Customer customer1;
    ArrayList<Item> listOfItems = new ArrayList<>();

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item1 = new Item(10.50);
        item2 = new Item(18.50);
        customer1 = new Customer(true);

    }

    @Test
    public void canApplyOver20DiscountTest() {
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        double beforeDiscount = shoppingBasket.getTotalValue();
        assertEquals(26.10, Discount.overTwentyPoundsDiscount(beforeDiscount));
    }

    @Test
    public void loyaltyCardUsedTest() {
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        double beforeDiscount = shoppingBasket.getTotalValue();
        assertEquals(28.419999999999998, Discount.LoyaltyCardUsed(beforeDiscount,customer1));
    }

    @Test
    public void bogofTest() {
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item2);
        listOfItems.add(item2);
        listOfItems.add(item2);
        listOfItems.add(item2);

        double beforeDiscount = shoppingBasket.getTotalValue();
        assertEquals(37.00, Discount.bogof(beforeDiscount,listOfItems));
    }

}
