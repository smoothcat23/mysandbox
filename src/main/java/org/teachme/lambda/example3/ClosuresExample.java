package org.teachme.lambda.example3;

/**
 *
 * From https://www.youtube.com/watch?v=WcLum7g6ImU
 *
 */
public class ClosuresExample {

    public static void main(String[] args){
        System.out.println("hallo closure test");

        int a = 10;
        int b = 20;

        // Example with anonymous class (bis Java7)
        //  - b ist speziell, der Wert 20 ist weiterhin bekannt Runtime.
        //  - an sich existiert die Variable b nicht in p.process(i)
        System.out.println("Anonymous class");
        doProcessAnonymous(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i + b);
            }
        });

        // Example with Lambda
        // - b ist speziell. Das kommt vom Closure
        // - es nutzt die Variable b im Scope der Klasse
        // - der Wert 20 wird eingeforen.
        // - Wie immer b sich später ändert, es wird b=20 hier verwendet.
        System.out.println("Lampda Expression");
        doProcess(a, i -> System.out.println(i + b));


    }

    public static void doProcessAnonymous(int i, Process p){
        p.process(i);
    }
    public static void doProcess(int i, Process p){
        p.process(i);
    }
}
