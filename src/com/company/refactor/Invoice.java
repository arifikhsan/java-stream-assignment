package com.company.refactor;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Integer id;
    private String title;
    private Customer customer;
    private Integer amount;

    public Invoice() {
    }

    public Invoice(Integer id, String title, Customer customer, Integer amount) {
        this.id = id;
        this.title = title;
        this.customer = customer;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public static ArrayList<Invoice> generateInvoices() {
        return new ArrayList<Invoice>(List.of(
                new Invoice(1, "Training", Customer.ORACLE, 100),
                new Invoice(2, "Training", Customer.ORACLE, 10),
                new Invoice(3, "Training", Customer.ORACLE, 10),
                new Invoice(4, "Training", Customer.ORACLE, 10),
                new Invoice(5, "Training", Customer.ORACLE, 10),
                new Invoice(6, "Training", Customer.ORACLE, 10)
        ));
    }
}
