package com.example.customers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerList {
    private String firstName;



    private String lastName;
    private String discountCardID;
    private String email;
    private String phoneNumber;

    public CustomerList(String firstName, String lastName, String discountCardID, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.discountCardID = discountCardID;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    CustomerList(){
        addCustomer( firstName, lastName,  discountCardID, email, phoneNumber);
    }
   private ArrayList <CustomerList> shoppersList = new ArrayList<>();
    ArrayList<CustomerList> addCustomer(String firstName, String lastName, String discountCardID, String email, String phoneNumber){
        CustomerList customer = new CustomerList(firstName,lastName,discountCardID,email,phoneNumber);
        shoppersList.add(customer);
        return shoppersList;
    }

    @Override
    public String toString() {
        return "CustomerList{" +
                "shoppersList=" + shoppersList +
                '}';
    }
}

