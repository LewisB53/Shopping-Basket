package com.codeclan.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/06/2017.
 */

public class DiscountsTest {

    ShoppingBasket shoppingBasket;
    Item item1;
    Item item2;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item1 = new Item(10.50);
        item2 = new Item(18.50);

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
        assertEquals(26.10, Discount.LoyaltyCardUsed(beforeDiscount));
    }

}
