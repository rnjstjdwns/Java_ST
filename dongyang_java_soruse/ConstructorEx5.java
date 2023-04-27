package dongyang_java_soruse;
class A {
    public A() {
        System.out.println("생성자A");
    }
    public A(int x) {
        System.out.println("매개변수생성자A" + x);
    }
}

class B extends A {
    public B() {
        super(30);
        System.out.println("생성자B");
    }
    public B(int x) {
        System.out.println("매개변수생성자B"+x);
    }
}
public class ConstructorEx5 {
    public static void main(String[] args) {
        B b;
        b = new B();
    }
}
