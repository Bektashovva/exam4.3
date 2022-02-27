package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Order {
    public int id;
    private LocalDate dateOrder;
    private LocalTime timeOrder;
    private List<Product> products;

    public Order() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public void setTi(LocalTime timeOrder) {
        this.timeOrder = timeOrder;
    }

    public void setTimeOrder(LocalTime timeOrders) {
        this.timeOrder = timeOrders;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
