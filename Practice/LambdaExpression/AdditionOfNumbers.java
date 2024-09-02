package Practice.LambdaExpression;

// performing addition operation using lambda expression with + operator

interface Operator<T> {
    T process (T a, T b);
}
public class AdditionOfNumbers {
    public static void main(String[] args) {
        // calculating the sum of 2 integer numbers using lambda expression
        Operator<Integer> intSum = (a,b) -> a + b;
        System.out.println("Sum of 2 integers 5 and 6: "+intSum.process(5,6));          // prints: 11

        // calculating the sum of 2 string numbers using lambda expression
        Operator<String> stringSum = (a, b) -> a + b;
        System.out.println("Sum of 2 string integers: "+stringSum.process("7","9"));  // prints: 79
        // it will concat the two provided strings
    }
}
