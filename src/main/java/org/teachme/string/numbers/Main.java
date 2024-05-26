package org.teachme.string.numbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Main {

    public static void main(String[] args) {
        System.out.println("Class NumberFormat example (numerics and Strings)");

        double doubleV = 1_234_567.79;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println("Double formatted value (US?): " + numberFormat.format(doubleV));

        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println("Double formatted integer: " + intFormat.format(doubleV));

        numberFormat.setGroupingUsed(false);
        System.out.println("Double value without grouping: " + numberFormat.format(doubleV));

        Locale locale = new Locale("de","DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println("Double formatted value (DE): " + localFormat.format(doubleV));

        NumberFormat currencyFormat_de = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Double formatted value as currency (DE): " + currencyFormat_de.format(doubleV));
        System.out.println("Double formatted value as currency (CH): " + NumberFormat.getCurrencyInstance(new Locale("de", "CH")).format(doubleV));
        System.out.println("Double formatted value as currency (US): " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(doubleV));

        DecimalFormat df = new DecimalFormat("$##0.##");
        System.out.println(df.format(1));
        System.out.println(df.format(5.891));
        System.out.println(df.format(12335.891));

    }
}