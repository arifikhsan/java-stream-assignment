package com.company;

import java.util.List;

/* 2. Given a list of integers, find out all the numbers starting
      with 1 using stream functions
 */
public class Two {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 9, 10, 11, 21);

        var filteredNumbers = numbers.stream().filter(number -> number.toString().startsWith("1")).toList();
        System.out.println("Number starting with 1:");
        System.out.println(filteredNumbers);
    }
}
