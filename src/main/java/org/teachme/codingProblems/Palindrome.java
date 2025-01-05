package org.teachme.codingProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

/**
  Direct String processing, loop.
  String or StringUtils API for reverse string?
  Java stream method (Lambda expression) ->
 **/

public class Palindrome {

    public boolean isPalindrome(String word) {
        return getPalindrome(word).equals(word) ? true : false;
    }

    public String getPalindrome(String word) {
        if(word==null) return null;

        String reversed = IntStream.range(0, word.length())
                .mapToObj(i -> word.charAt(word.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());

        return reversed;
    }

    public static void test_multiple_variations(List<String> strings){
        for (String str : strings) {
            if( str!=null && (!str.isEmpty() ) ){
                Palindrome.test_multiple_variations(str);
            }
        }
    }

    public static void test_multiple_variations(String str){
        Palindrome.test_string_processing(str);
        Palindrome.test_stringUtils(str);        
        Palindrome.test_stream(str);
    }

    public static void test_string_processing( String str){
        String myName = new Object(){}.getClass().getEnclosingMethod().getName();
        
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(myName + ": " + str + " is " + sb.toString().equals(str));
    }

    public static void test_stringUtils( String str){
        String myName = new Object(){}.getClass().getEnclosingMethod().getName();

        System.out.println(myName + ": " + str + " is " + StringUtils.reverse(str).equals(str));
    }

    // von chatgpt
    public static void test_stream(String str){
        String myName = new Object() {}.getClass().getEnclosingMethod().getName();

        // Use IntStream to create a stream of indices and reverse them
        String reversed = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(myName + ": " + str + " is " + reversed.equals(str));
    }





}


