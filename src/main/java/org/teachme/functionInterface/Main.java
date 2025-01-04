package org.teachme.functionInterface;

import org.teachme.lambda.example1.Foo;
import org.teachme.lambda.example1.UseFoo;

import java.util.function.Function;

public abstract class Main {
    // C:\Users\angel\AppData\Local\JetBrains\IdeaIC2023.1\log
    // Windows Defender add exception paths failed....

    // arbeite gerade das durch:  https://www.baeldung.com/java-8-lambda-expressions-tips

    public static void main(String[] args) {
        System.out.println("Learning Java");

        function_interface_example();
    }

    public static void function_interface_example(){
        System.out.println("Try functional interface");

        UseFoo useFoo = new UseFoo();

        Foo foo = parameter -> parameter + " from lambda using own interface class";
        String result = useFoo.add("Message ", foo);
        System.out.println("result: " + result);

        Function<String, String> fn =
                parameter -> parameter + " from lambda using existing Function<T,R> class";
        result = useFoo.addNew("Message ", fn);
        System.out.println("result: " + result);
    }
}
