package FunctionalInterfaces;

@FunctionalInterface
interface MathCal {
    int calculate(int i);
}

public class SquareOfNum {
    public static void main(String[] args) {
        int a = 5;
        MathCal s = (int x) -> x * x;        // lambda expression used to create an object of an interface
        int ans = s.calculate(a);
        System.out.println("Square of number "+a+" is "+ans);

        MathCal cube = (int y) -> y*y*y;
        int newAns = cube.calculate(a);
        System.out.println("Cube of number "+a+" is "+newAns);
    }
}
