package Optional;

import java.util.Optional;

// static method for creating an object of an optional class
// they just creates a single value or they act as a single value container

public class OptionalDemo {
    public static void main(String[] args) {
        // creating an optional object using of, empty, ofNullable
        // using empty() method
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // using of() method => internally uses requiredNonNull() method
        String email = "digvijay@gmail.com";
//        String email = null;
        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        // using ofNullable() method
        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);
        // if value is null it won't throw NPE it will simply return empty object of Optional class

    }
}
