package com.company;

import java.util.List;

/* 4. Given a list of integers, sort all the values present
      in it using stream functions
 */
public class Four {
    public static void main(String[] args) {
        var numbers = List.of(5, 3, -8, 1, 0, -10, 14);
        var sortedNumbers = numbers.stream().sorted().toList();

        System.out.println("Sorted numbers:");
        System.out.println(sortedNumbers);
    }
}
