package org.teachme.string.algorithms;

/**
 *
 * basierend auf Kurs:  https://www.linkedin.com/learning/java-algorithms/apply-custom-parsing-to-search-algorithms
 */

public abstract class Main {

    public static void main(String[] args) {
        System.out.println("Kurs Java algorithms");
        validateUpperCases();
        matchOddCharacter();
        reverseString();

        // Challenges
        System.out.println(Challenges.reverseEachWord("sally is a great worker"));
    }

    public static void reverseString(){
        System.out.println("Create algorithm-driven strings in Java");
        System.out.println(Algorithms.reverse(null));
        System.out.println(Algorithms.reverse(""));
        System.out.println(Algorithms.reverse("Hello"));
        System.out.println(Algorithms.reverse("Hi!"));
    }

    public static void matchOddCharacter(){
        System.out.println("Apply custom parsing to search algorithms");

        String s = "HaLLo";
        System.out.println(Algorithms.isAtEvenIndex(s, 'L'));
        System.out.println(Algorithms.isAtEvenIndex(s, 'T'));
        System.out.println(Algorithms.isAtEvenIndex(s, 'H'));
        System.out.println(Algorithms.isAtEvenIndex("", 'H'));
        System.out.println(Algorithms.isAtEvenIndex(null, 'H'));
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
