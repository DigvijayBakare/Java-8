package Optional;

import java.util.Optional;

public class ObjectCreation {
    public static void main(String[] args) {
        Optional<Integer> obj1 = Optional.empty();
//        System.out.println(obj1.get());

        //
        Optional<Integer> obj2 = Optional.of(5);
        System.out.println(obj2.get());

        //
        Optional<Integer> obj3 = Optional.ofNullable(10);
        System.out.println(obj3.get());
    }
}
