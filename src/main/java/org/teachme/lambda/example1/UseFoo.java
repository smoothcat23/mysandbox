package org.teachme.lambda.example1;

import java.util.function.Function;

public class UseFoo {

    public String add(String str, Foo foo) {
        return foo.method(str);
    }

    public String addNew(String str, Function<String, String> fn) {
        return fn.apply(str);
    }
}