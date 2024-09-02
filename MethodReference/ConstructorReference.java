package MethodReference;

import java.util.function.Supplier;

// You can also refer to the constructor of a class same as method references.

class NewCompany {
    public NewCompany() {
        System.out.println("Constructor accessed!");
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        // creating object using lambda
        Supplier<NewCompany> l = () -> new NewCompany();
        l.get();
//        System.out.println(l.get());

        // creating object using constructor reference
        Supplier<NewCompany> c = NewCompany :: new;
        c.get();
//        System.out.println(c.get());
    }
}
