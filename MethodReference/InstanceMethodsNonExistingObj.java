package MethodReference;

import java.util.function.Supplier;

// Use this syntax when you are referring to an instance method by passing reference variables as an argument.

class Company {
    String name;
    public String getName() {
        return name;
    }
    public Company(String name) {
        this.name = name;
    }
}
public class InstanceMethodsNonExistingObj {
    public static void main(String[] args) {
        // creating object of company class
        Company c = new Company("My_Company");

        // calling getName() method of c using lambda
        Supplier<String> l = () -> c.getName();
        System.out.println("Using lambda: "+l.get());

        // calling getName() method using method reference
        Supplier<String> m = c :: getName;
        System.out.println("Using method reference: "+m.get());
    }
}
