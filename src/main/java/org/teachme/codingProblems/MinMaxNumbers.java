package org.teachme.codingProblems;

import java.util.Arrays;

public class MinMaxNumbers {
    private int[] numbers = {};

    public MinMaxNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getMax(){
        return Arrays.stream(this.numbers).max().getAsInt();
    }

    public int getMin(){
        return Arrays.stream(this.numbers).min().getAsInt();
    }

    public void showMinMaxNumbers(){
        System.out.println("min is: " + getMin() + " max is: " + getMax() + " in " + Arrays.toString(numbers) );
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
