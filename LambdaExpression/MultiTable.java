package LambdaExpression;

@FunctionalInterface
interface Table {
    int calculate(int i);
}

public class MultiTable {
    public static void main(String[] args) {
        // print the multiplication table using lambda
        int x = 10;

        System.out.println("Multiplication table: ");

        for (int i=1; i<=x; i++) {
            int finalI = i;

            Table t = (int a) -> a * finalI;
            int ans = t.calculate(5);
            System.out.print(ans+" ");
        }
        System.out.println();
    }
}
