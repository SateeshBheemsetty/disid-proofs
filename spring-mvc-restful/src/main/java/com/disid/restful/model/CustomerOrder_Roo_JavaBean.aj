// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.disid.restful.model;

import com.disid.restful.model.Customer;
import com.disid.restful.model.CustomerOrder;
import com.disid.restful.model.OrderDetail;
import java.util.Date;
import java.util.Set;

privileged aspect CustomerOrder_Roo_JavaBean {
    
    public Date CustomerOrder.getOrderDate() {
        return this.orderDate;
    }
    
    public void CustomerOrder.setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    public Date CustomerOrder.getShippedDate() {
        return this.shippedDate;
    }
    
    public void CustomerOrder.setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }
    
    public String CustomerOrder.getShipAddress() {
        return this.shipAddress;
    }
    
    public void CustomerOrder.setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }
    
    public Set<OrderDetail> CustomerOrder.getDetails() {
        return this.details;
    }
    
    public void CustomerOrder.setDetails(Set<OrderDetail> details) {
        this.details = details;
    }
    
    public Customer CustomerOrder.getCustomer() {
        return this.customer;
    }
    
    public void CustomerOrder.setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
