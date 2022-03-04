package com.company.refactor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeforeRefactor {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Integer> firstFiveIds = new ArrayList<>();

        invoices.addAll(Invoice.generateInvoices());

        for (Invoice inv : invoices) {
            if (inv.getCustomer() == Customer.ORACLE) {
                if (inv.getTitle().contains("Training")) {
                    oracleAndTrainingInvoices.add(inv);
                }
            }
        }

        Collections.sort(oracleAndTrainingInvoices, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice inv1, Invoice inv2) {
                return Double.compare(inv1.getAmount(), inv2.getAmount());
            }
        });

        for (Invoice inv : oracleAndTrainingInvoices) {
            ids.add(inv.getId());
        }

        for(int i = 0; i < 5; i++) {
            firstFiveIds.add(ids.get(i));
        }

        System.out.println(firstFiveIds);
    }
}
