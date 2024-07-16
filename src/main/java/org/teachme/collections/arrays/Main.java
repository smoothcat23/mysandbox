package org.teachme.collections.arrays;

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
    }

}
