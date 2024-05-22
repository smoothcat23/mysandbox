package org.teachme.string.comparing;


public abstract class Main {

    public static void main(String[] args) {
        System.out.println("String comparing example");

        // Method of String class
        // intern() method creates an exact copy of a string located in the heap memory and
        // stores it in the string constant pool. With this method, it is possible to optimize
        // memory usage in a Java program by reusing identical string objects
        String s1 = "Hello!";
        String s2 = "Hello!";
        // ctrl + shift + return
        if (s1 == s2) {
            System.out.println("s1+s2 match");
        } else {
            System.out.println("s1+s2 no match");
        }

        // hier werden Objekte explizit instantiiert.
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        if (s3 == s4) {
            System.out.println("s3+s4 match");
        } else {
            System.out.println("s3+s4 no match");
        }

        // corrected
        if (s3.equals(s4)) {
            System.out.println("s3+s4 match");
        } else {
            System.out.println("s3+s4 no match");
        }

    }
}
