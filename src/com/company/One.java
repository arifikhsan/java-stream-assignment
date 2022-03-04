package com.company;

import java.util.List;

/* 1. Given a list of integers, find out all the even numbers
      exist in the list using Stream function
 */
public class One {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println("Even numbers: ");
        System.out.println(evenNumbers);
    }
}
