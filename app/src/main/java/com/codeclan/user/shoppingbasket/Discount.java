package com.codeclan.user.shoppingbasket;


import java.util.ArrayList;

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

    public static double bogof(double beforeDiscount,ArrayList listOfItems) {

        int freeItems= listOfItems.size() / 2;
        Math.floor(freeItems);
        int chargable = listOfItems.size() - freeItems;

        double discountedPrice = beforeDiscount / listOfItems.size() * chargable ;
        return discountedPrice;

    }
}
