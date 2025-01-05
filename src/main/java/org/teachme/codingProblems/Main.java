package org.teachme.codingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Coding Examples
 * 
From ChatGpt
1. Write a program to determine if a given string is a palindrome.
2. Implement the Fibonacci series up to a given number.
3. Write a Java program to check if a number is prime.
4. Find the largest and smallest numbers in an array.
5. Write a program to sort a list of numbers without using built-in sort methods.


 */

public abstract class Main {

    public static void main(String[] args) {

        System.out.println("Coding Problems");
        
        // Palindrome
        List<String> myStrings = Arrays.asList(null,"","banane","anana","saippuakivikauppias");
        System.out.println("Testing various strings for beeing a Palindrome");
        for (String s : myStrings) {
            
        }
        Palindrome.test_multiple_variations(myStrings);

        // Fibonacci
        //Fibonacci.showSequenceUpTo(13);

        // is number prime?
        int number = 97;
        if(Prime.isPrime(number)){
            System.out.println(number + " is a prime");
        }else{
            System.out.println(number + " is not a prime");
        }        

        // identify min max value in arr
        int[] numbers = {0,1,2,3,4,5};
        MinMaxNumbers mmn = new MinMaxNumbers(numbers);
        mmn.showMinMaxNumbers();
    }
}
