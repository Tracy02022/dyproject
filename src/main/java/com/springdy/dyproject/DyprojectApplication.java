package com.springdy.dyproject;

import com.springdy.customer.dao.CustomerDAO;
import com.springdy.customer.model.Customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DyprojectApplication {

    public static void main(String[] args) {

//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/db01?useSSL=false","root","12345678");
////here sonoo is database name, root is username and password
//            Statement stmt=con.createStatement();
//            ResultSet rs=stmt.executeQuery("select * from customer");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//            con.close();
//        }catch(Exception e){ System.out.println(e);}
//
//




        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/Spring-Module.xml");

        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDao");

        Customer customer = new Customer(1, "Mike", 27);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(1);

        System.out.println(customer1);

    }

}
