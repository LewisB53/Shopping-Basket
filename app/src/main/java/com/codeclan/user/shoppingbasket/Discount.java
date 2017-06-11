package com.codeclan.user.shoppingbasket;

/**
 * Created by user on 11/06/2017.
 */

class Discount {


    public static double overTwentyPoundsDiscount(double beforeDiscount) {
        if (beforeDiscount > 20.00)
        {double discountedPrice = beforeDiscount * 0.9;
        return discountedPrice;
        }
        else return beforeDiscount;
    }

    public static double LoyaltyCardUsed(double beforeDiscount, Customer customer1) {
        if(customer1.loyaltyCardHolder()) {
            double discountedPrice = beforeDiscount * 0.98;
            return discountedPrice;
        }
        else return beforeDiscount;
    }
}
