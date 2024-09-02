package FunctionalInterfaces;

@FunctionalInterface
interface AInter {
    void display();
    static void m1() {
        System.out.println("Static method in AInter");
    }
}
class BClass implements AInter {
    @Override
    public void display() {
        System.out.println("In class B");
    }
}
@FunctionalInterface
interface CInter extends AInter {
    void m2();
    @Override
    default void display() {
        System.out.println("In interface C");
    }
}
class DClass extends BClass implements CInter {
    @Override
    public void m2() {
        System.out.println("Implemented method in DClass");
    }
}
public class Scenarios {
    public static void main(String[] args) {
        AInter obj = new DClass();
        obj.display();              // print's "In class B"
//        obj.m2();
//        obj.m1();
    }
}
