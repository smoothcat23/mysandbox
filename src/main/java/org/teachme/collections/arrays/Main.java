package org.teachme.collections.arrays;

import java.util.Arrays;

/**
 *
 * basierend auf Kurs:  <a href="https://www.linkedin.com/learning/java-algorithms/apply-custom-parsing-to-search-algorithms">...</a>
 */

public abstract class Main {

    public static void main(String[] args) {

        System.out.println("Array algorithms");

        // linear Search an item in an Array
        int[] arr = {1,2,3,4,5,6};
        System.out.println("is " + Algorithms.linearSearch(arr, 1));
        System.out.println("is " + Algorithms.linearSearch(arr, 8));

        // linear Search with Java Streams
        Algorithms.linearSearchStreams(arr, 1).ifPresent(System.out::println);
        Algorithms.linearSearchStreams(arr, 8).ifPresent(System.out::println);

        // Binary search arrays in Java
        int[] arr1 = {0,7,10,20,39,50,92} ;
        System.out.println("is found after " + Algorithms.binarySearch(arr1, 50) + " trials");
        //Arrays.binarySearch(arr, 50);

        // aggregate and filter Arrays
        // 2 Arrays in einem Array, dabei nur geraden Zahlen übernehmen
        int[] arr2 = {-9,3,2,-8,12,-16};
        int[] arr3 = {0,-3,-8,-35,40,20,7};

        // verschiedene Möglichkeiten, wir wählen dann 2)
        // 1) Merge arrays and then remove invalid items
        // 2) Check each element and only keep valid items
        // 3) Sort each array and take only valid items.
        Arrays.stream(Algorithms.findEverNums(arr2, arr3))
                .forEach(System.out::println);

        System.out.println();

        Arrays.stream(Algorithms.findEverNums2(arr2, arr3))
                .forEach(System.out::println);
    }

}
