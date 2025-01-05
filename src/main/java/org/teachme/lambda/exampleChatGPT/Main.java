package org.teachme.lambda.exampleChatGPT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/*
https://chatgpt.com/g/g-p-67715baef69c8191886e1f73e336ac0d-weiterbild/c/67795f58-67e4-8012-ac66-e72cc96614c7

1. Task: Sorting Strings Write a lambda function to sort a list of strings in reverse order.
List<String> strings = Arrays.asList("apple", "banana", "cherry");

2. Task: Implement a Functional Interface Create a functional interface StringManipulator with a method String manipulate(String input). Write a lambda expression to reverse a string.
StringManipulator reverse = // your lambda here

3. Task: Filter and Collect Given a list of integers, filter out numbers greater than 10 and collect them into a new list.
List<Integer> numbers = Arrays.asList(5, 15, 25, 3, 9);

4. Task: Custom Predicate Use a Predicate functional interface to filter strings that start with the letter 'A' in a list.
List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
*/


public abstract class Main {
    public static void main(String[] args) {
        System.out.println("Learning Java");

        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        // https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
        // https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

        task1();
        task1OldSchool();
    }

    public static void task1(){
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "ananas");
        List<String> sorted = strings.stream().sorted().toList();

        List<String> reversed = strings.stream().sorted((s1,s2) -> s2.compareTo(s1)).toList();

        System.out.println(sorted.toString());
        System.out.println(reversed);
    }

    public static void task1OldSchool(){
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "ananas");

        List<String> reversed = strings.stream().sorted( new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        }).toList();

        System.out.println(reversed);
    }
}

