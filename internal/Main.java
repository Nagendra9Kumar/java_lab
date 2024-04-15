class A {
    void display() {
        System.out.println("In class A display");
    }
}

class B extends A {
    void call() {
        System.out.println("In class B call");
    }
}

class C extends B {
    void sum() {
        System.out.println("In class C sum");
    }
}

public class Main {
    public static void main(String[] args) {
        C c1 = new C();
        c1.display();
        c1.call();
        c1.sum();
    }
}