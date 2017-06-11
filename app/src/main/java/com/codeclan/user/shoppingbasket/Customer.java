package com.codeclan.user.shoppingbasket;

/**
 * Created by user on 11/06/2017.
 */

class Customer {

    private boolean loyaltyCard;

    public Customer(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public boolean loyaltyCardHolder() {
        return loyaltyCard;
    }

}
