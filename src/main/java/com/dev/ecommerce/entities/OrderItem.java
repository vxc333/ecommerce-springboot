package com.dev.ecommerce.entities;

public class OrderItem {

    private  OrderItemPK id =  new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItem(Order order,Product product ,Double price, Integer quantity) {
        id.setOrder(order);
        id.setProduct(product);
        this.price = price;
        this.quantity = quantity;
    }
}
