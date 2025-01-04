package org.teachme.string.scanner;

import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        System.out.println("Scanner example");

        StringBuilder b = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value 1");
        String input1 = scanner.nextLine();

        System.out.println("Enter value 1");
        String input2 = scanner.nextLine();

        b.append(input1)
                .append(", ")
                .append(input2);

        System.out.println(b.toString());

        scanner.close();
    }
}
