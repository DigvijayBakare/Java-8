package FunctionalInterfaces;

interface Left {
    default void m1() {
        System.out.println("Left default method");
    }
    static void m2(){
        System.out.println("Static method in Left Interface");
    }
}
interface Right {
    default void m1() {
        System.out.println("Right default method");
    }
    static void m2(){
        System.out.println("Static method in Right Interface");
    }
}
public class AmbiguityProblem implements Left, Right {
    @Override
    public void m1() {
        System.out.println("My own new Method");
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args) {
        AmbiguityProblem ap = new AmbiguityProblem();
        ap.m1();
        Left.m2();
        Right.m2();
    }
}
