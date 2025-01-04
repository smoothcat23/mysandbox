package org.teachme.codingProblems;

/**
 * Show Fibonacci sequence up to certain position 
 */


public class Fibonacci {
    private static final int FIRST = 1;
    private static final int SECOND = 1;
    private int position;
    private int[] sequence;

    public Fibonacci(int position) {
        this.position = position;
    }

    public static void showSequenceUpTo(int threshold){
        int first = 1;
        int second = 1;
        int sum = 0;
        int[] sequence;

        System.out.println("Show Fibonacci sequence up to " + threshold);
        System.out.print(first + "," + second + ",");

        while(sum <= threshold ){
            sum = first + second;
            System.out.print(sum + ",");
            first = second;
            second = sum;
        }
        System.out.println("... done ");
    }

    public int[] getSequence() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSequence'");
    }
}


