package FunctionalInterfaces.ConsumerInterface;

import java.util.function.*;

class Movie {
    String name;
    Movie(String name) {
        this.name = name;
    }
}
public class ConsumerMethods {
    public static void main(String[] args) {
        Consumer<Movie> c1 = s -> System.out.println(s.name+" ready to release!");
        Consumer<Movie> c2 = s -> System.out.println(s.name+" released but it is a bigger flop!!");
        Consumer<Movie> c3 = s -> System.out.println(s.name+" Storing information in database");
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        Movie m = new Movie ("Krish4");
        cc.accept(m);
    }
}
