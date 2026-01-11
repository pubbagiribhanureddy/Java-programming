class A {
    void display() {
        System.out.println("Super class method");
    }
}
class B extends A {
    void display() {
        super.display();
        System.out.println("Sub class method");
    }
}
public class super_method {
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
    }
}
