package org.teachme.string.algorithms;

public class Challenges {

    public static String reverseEachWord(String s){
        System.out.println("Challenge: Reverse each word");

        if(s==null || s.isEmpty()){
            return s;
        }

        String[] words = s.split(" ");
        StringBuilder reversedS = new StringBuilder();

        for(int i=0; i <= words.length -1 ; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            reversedS.append( sb.reverse().toString() + " ");
        }

        reversedS.trimToSize();
        return reversedS.toString();

        //return reversedS.toString().trim();
    }

}
