package MethodReference;

import java.util.function.Function;

// Use this syntax when you are referring to an instance method of already existing object.

public class InstanceMethodsExistingObj {
    public static void main(String[] args) {
        // calling toLowerCase() method using lambda
        Function<String, String> l = (String s) -> s.toLowerCase();
        System.out.println("Using lambda: "+l.apply("JAVA"));

        // calling toLowerCase() method using method reference
        Function<String, String> m = String :: toLowerCase;
        System.out.println("Using method reference: "+m.apply("JAVA PROGRAM"));
    }
}
