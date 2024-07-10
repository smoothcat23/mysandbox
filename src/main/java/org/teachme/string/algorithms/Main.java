package org.teachme.string.algorithms;

/**
 *
 * basierend auf Kurs:  https://www.linkedin.com/learning/java-algorithms/apply-custom-parsing-to-search-algorithms
 */

public abstract class Main {

    public static void main(String[] args) {

        System.out.println("Validation algorithms");
        validateUpperCases();

    }

    public static void validateUpperCases(){
        System.out.println("Validate if all characters are in upper case");
        String str1 = "banane";
        String str2 = "BANANE";

        if(Algorithms.isUppercase(str1)){
            System.out.println("-" + str1 + " is in upper case ");
        }else{
            System.out.println("-" + str1 + " is not in upper case ");
        }
        if(Algorithms.isUppercase(str2)){
            System.out.println("-" + str2 + " is in upper case ");
        }else{
            System.out.println("-" + str2 + " is not in upper case ");
        }
    }
}
