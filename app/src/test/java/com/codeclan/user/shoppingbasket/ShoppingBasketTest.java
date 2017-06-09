package com.codeclan.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 09/06/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item item;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item = new Item();
    }

    @Test
    public void isBasketEmptyTest() {
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void canAddItemToBasketTest() {
        shoppingBasket.addItem(item);
        assertEquals(1, shoppingBasket.countItems());
    }


}
