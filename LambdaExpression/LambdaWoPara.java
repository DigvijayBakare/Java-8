package LambdaExpression;

@FunctionalInterface
interface PiValue {
    double getPI();
}
public class LambdaWoPara {
    public static void main(String[] args) {
        // declaring an reference to the interface
        PiValue pi;

        // lambda expression
        pi = () -> 3.1415;

        // print the value of PI
        System.out.println("The value of PI: "+pi.getPI());
    }
}
