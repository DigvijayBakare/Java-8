package Optional;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
//        String email = null;
        String email = "digvijay@gmail.com";

        // getting or retrieving a value from a Optional object
        Optional<String> stringOptional = Optional.ofNullable(email);
//        System.out.println(stringOptional.get());    // we don't use this line directly in our project
        // for null value it will throw NoSuchElementException: No value present

        // isPresent() method => if value is present them it returns true
//        if (stringOptional.isPresent()) {
//            System.out.println(stringOptional.get());
//        } else {
//            System.out.println("no value present");
//        }

        // how to get default value from optional class
        String defaultOptional = stringOptional.orElse("default@gmail.com");
        System.out.println(defaultOptional);

        // orElseGet() method
        String optionalDefault = stringOptional.orElseGet(() -> "default@gmail.com");
        System.out.println(optionalDefault);

        // orElseThrow() method
        String optionalObj = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email does not exit!"));
        System.out.println(optionalObj);

        // ifPresent() method
        Optional<String> gender = Optional.of("Male");
        Optional<String> empty = Optional.empty();
        gender.ifPresent(s -> System.out.println("value is present"));
        empty.ifPresent(s -> System.out.println("no is present"));

        // filter() method
        String result = " abc ";
        if (result != null && result.contains("abc")) {
            System.out.println(result);
        }

        Optional<String> optionalString = Optional.of(result);
        optionalString.filter(s -> s.contains("abc")).ifPresent(s -> System.out.println(result));

        // map method in Optional provides a way to transform value in Optional from one type to another
        optionalString.filter(s -> s.contains("abc")).map(String::trim).ifPresent(System.out::println);

    }
}
