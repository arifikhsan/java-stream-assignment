package com.company.refactor;

import java.util.ArrayList;
import java.util.Comparator;

public class AfterRefactor {
    public static void main(String[] args) {
        var invoices = new ArrayList<>(Invoice.generateInvoices());

        var firstFiveIds = invoices.stream()
                .filter(invoice -> invoice.getCustomer() == Customer.ORACLE)
                .filter(invoice -> invoice.getTitle().contains("Training"))
                .sorted(Comparator.comparing(Invoice::getAmount))
                .map(Invoice::getId)
                .limit(5)
                .toList();

        System.out.println(firstFiveIds);
    }
}
