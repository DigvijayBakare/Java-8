package Practice.Examples;

interface A {
    void m1();
}
class B {
    void m1() {
        System.out.println("HI");
    }
}
public class TestingClassInterface extends B implements A{
    @Override
    public void m1() {
//        super.m1();
        System.out.println("BYY");
    }

    public static void main(String[] args) {
        TestingClassInterface t = new TestingClassInterface();
        t.m1();
    }
}
