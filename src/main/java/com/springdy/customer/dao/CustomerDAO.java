package com.springdy.customer.dao;

import com.springdy.customer.model.Customer;

public interface CustomerDAO {

    public void insert(Customer customer);

    public Customer findByCustomerId(int custId);



}
