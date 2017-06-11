package com.codeclan.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/06/2017.
 */

public class CustomerTest {

    Customer customer1;

    @Before
    public void before() {
        customer1 = new Customer(true);
    }


    @Test
    public void hasLoyaltyCard() {
        assertEquals(true, customer1.loyaltyCardHolder());
    }
}
