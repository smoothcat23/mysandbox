package org.teachme.codingProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Show Fibonacci sequence up to certain position 
 */


public class Fibonacci {
    private static final int FIRST = 1;
    private static final int SECOND = 1;
    private int threshold;
    private List<Integer> sequence;

    public Fibonacci(int threshold) {
        this.threshold = threshold;
        this.sequence = new ArrayList<Integer>();
    }

    public int[] getSequence() {
        int first = FIRST;
        int second = SECOND;
        int sum = FIRST + SECOND;

        sequence.add(FIRST);
        sequence.add(SECOND);

        while( sum <= threshold ){
            sequence.add(Integer.valueOf(sum));
            first = second;
            second = sum;
            sum = first + second;
        }

        int[] sequenceArr = new int[sequence.size()];
        for(int i=0; i<sequence.size(); i++){
            sequenceArr[i] = sequence.get(i);
        }

        return sequenceArr;
    }

    // chatgpt, better version
    public int[] getSequenceStream() {
        int first = FIRST;
        int second = SECOND;

        sequence.add(first);
        sequence.add(second);

        while( true ){
            int sum = first + second;
            if (sum > threshold) break;

            sequence.add(sum);
            first = second;
            second = sum;
        }

        // method reference:            mapToInt(Integer::intValue) 
        // is shorthand for lambda:     mapToInt(i -> i.intValue()) 
        return sequence.stream().mapToInt(Integer::intValue).toArray();
    }
}


