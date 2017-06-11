package com.codeclan.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 09/06/2017.
 */

public class ShoppingBasketTest {

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
    public void isBasketEmptyTest() {
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void canAddItemToBasketTest() {
        shoppingBasket.addItem(item1);
        assertEquals(1, shoppingBasket.countItems());
    }

    @Test
    public void canRemoveItemFromBasketTest() {
        shoppingBasket.addItem(item1);
        shoppingBasket.removeItem(item1);
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void canClearAllItemsTest() {
        shoppingBasket.addItem(item1);
        shoppingBasket.clearAllItems();
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void cangetTotalValueTest() {
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        assertEquals(29.00, shoppingBasket.getTotalValue());
    }


}
