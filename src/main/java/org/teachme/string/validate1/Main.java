package org.teachme.string.validate1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public abstract class Main {

    public static void main(String[] args) {
        System.out.println("Validate Strings");

        System.out.println( isPasswordComplex("Hallo"));
        System.out.println( isPasswordComplex("hallo"));
        System.out.println( isPasswordComplex("Hall0"));
        System.out.println( isPasswordComplex("01232"));
        System.out.println( isPasswordComplex("HALL0"));

        System.out.println(normalizeString("HAll12-12,32 "));

        Main.test1();
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

    public static void test1(){
        System.out.println("test some method references");

        List<String> myList = Arrays.asList("hallo", "Welt");

        // wäre interessant ein Consumer Object zu erzeugen
        // was ist genau ein Consumer Object
        // https://www.baeldung.com/foreach-java
        myList.forEach(word ->

             System.out.println(StringUtils.capitalize(word))
        );

        //myList.forEach(word -> System.out.println(word));
        //myList.forEach(System.out::println);
    }
}
