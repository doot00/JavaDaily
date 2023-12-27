package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {

    User user;
    Product product;
    // public이 붙어야 다른 패키지에서 Order를 사용할 수 있다.
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
