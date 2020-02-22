package com.springdy.customer.model;

public class Customer {

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Customer(int cust_id, String name, int age) {
        this.cust_id = cust_id;
        this.name = name;
        this.age = age;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int cust_id;
    String name;
    int age;

}
