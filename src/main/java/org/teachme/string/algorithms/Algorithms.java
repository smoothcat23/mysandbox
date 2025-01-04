package org.teachme.string.algorithms;

public class Algorithms {

    public static boolean isUppercase(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static String reverse(String s){
        if(s==null || s.isEmpty()){
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        for(int i = s.length() -1; i >= 0; i--){
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseImproved(String s){
        if(s==null || s.isEmpty()){
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    /*
      Example: To find out if a specific character exists at an even position.
     */
    public static boolean isAtEvenIndex(String s, char item){
        if(s==null || s.isEmpty()){
            return false;
        }

        for (int i = 0; i < s.length() / 2 + 1; i=i+2){
            if(s.charAt(i) == item){
                return true;
            }
        }
        return false;
    }
}
