package com.codeclan.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 10/06/2017.
 */

public class ItemTest {
    Item item1;

    @Before
    public void before() {
        item1 = new Item(10.50);
    }


    @Test
    public void itemHasPriceTest() {
        assertEquals(10.50, item1.getValue());
    }
}
