package org.teachme.string.validate1;


import java.util.Locale;

public abstract class Main {

    public static void main(String[] args) {
        System.out.println("Validate Strings");

        System.out.println( isPasswordComplex("Hallo"));
        System.out.println( isPasswordComplex("hallo"));
        System.out.println( isPasswordComplex("Hall0"));
        System.out.println( isPasswordComplex("01232"));
        System.out.println( isPasswordComplex("HALL0"));

        System.out.println(normalizeString("HAll12-12,32 "));
    }

    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);

        // falsch wäre. Da ODER und nach einem Match, ein TRUE resultiert. Komplexität nicht validiert.
        //return s.chars().anyMatch( c -> Character.isUpperCase(c) || Character.isLowerCase(c) || Character.isDigit(c) );
    }

    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",","");
    }
}
