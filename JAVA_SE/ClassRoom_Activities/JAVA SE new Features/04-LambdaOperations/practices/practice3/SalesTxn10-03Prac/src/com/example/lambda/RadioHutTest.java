package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class RadioHutTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> radioReport = 
          t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() 
          + "-- Buyer: " + t.getBuyerName() + " -- State: " 
          + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());
        
        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");
        tList.stream()
                .filter(e->e.getBuyerName().equals("Radio Hut"))
                .forEach(radioReport);
        
        // Print out the total number of transactions
        
        long totalTransactions =tList.stream()
                .filter(e ->e.getBuyerName().equals("Radio Hut"))
                .count();
        System.out.print("Total Transactions: "+totalTransactions);

        // Print largest transaction
        System.out.println("=== Radio Hut Largest ===");

        tList.stream()
                .filter(e ->e.getBuyerName().equals("Radio Hut"))
                .max((e1,e2)->Double.compare(e1.getTransactionTotal(),e2.getTransactionTotal()))
                .ifPresent(radioReport);
        
        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");

       tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                 .min((t1, t2) -> Double.compare(t1.getTransactionTotal(), t2.getTransactionTotal()))
                 .ifPresent(radioReport);
        
    }
}
