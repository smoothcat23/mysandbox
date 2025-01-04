package org.teachme.lambda.example2;

import java.util.ArrayList;

import org.teachme.lambda.example2.*;


public abstract class Main {

    public static void main(String[] args) {
        System.out.println("hallo World");

        // https://www.w3schools.com/java/java_lambda.asp

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); });

        // dies kann nun verbessert werden mit einer Methode Reference
        numbers.forEach(System.out::println);
    }
}