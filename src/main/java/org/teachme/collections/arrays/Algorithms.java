package org.teachme.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Algorithms {

    public static Integer linearSearch(int[] arr, int item){
        for (int current : arr){
            if(current == item){
                return item;
            }
        }
        return null;
    }

    public static OptionalInt linearSearchStreams(int[] arr, int item){
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    // Binary search arrays in Java
    // a divide-and-conquer algorithm where in each step it halves
    // the number of elements it has to search trough
    // Beispiel:  {0,7,10,20,39,50,92}   , wir suchen 50
    // Die erste Suchposition is 20 und seit 20 kleiner als 50 ist,
    // geht die suche weiter in der zweiten Hälfte es Array
    // Somit ist der nächste Vergleich bei 50. Was unserer Suche entspricht.
    //
    // Linear search: no assumptions, 0(n) timme
    // Binary search: sorted assumptions, 0(log(n)) time
    public static int binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length - 1;
        int trials = 0;

        while (min <= max){
            ++trials;
            int mid = (min + max) / 2;
            if(item == arr[mid]){
                return trials;
            }else if(item <arr[mid]){
                max = mid - 1;
            } else{
                min = mid + 1;
            }
        }

        return -1;
    }

    // Erste Version
    public static int[] findEverNums(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();

        for(int num: arr1){
            if(num % 2 == 0 ){
                result.add(num);
            }
        }
        for(int num: arr2){
            if(num % 2 == 0 ){
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Zweite Version, simpler
    public static int[] findEverNums2(int[] arr1, int[] arr2) {
        IntPredicate isEvenPred = num -> num % 2  == 0;
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenPred)
                .toArray();
    }
}
