package org.teachme.codingProblems;

public class Prime {
    

    public static boolean isPrime(int n){
        // deal with numbers smaller 1 or is an even number
        if (n <= 1 || n%2==0 )
            return false;

        // deal with odd ns
        for(int d=3; d <= n/3; d +=2){
            if( n%d==0 )
                return false;
        }
        return true;
    }
}
