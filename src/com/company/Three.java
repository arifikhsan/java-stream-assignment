package com.company;

import java.util.List;

/* 3. Given a list of integers, find the total number of elements
      present in the list using stream function
 */
public class Three {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var total = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Total sum of numbers is: " + total);
    }
}
