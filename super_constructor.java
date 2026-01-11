class A{
      A() {
        System.out.println("Superclass constructor called");
     }
}
class B extends A {
    B() {
        super(); // Calls the constructor of class A
        System.out.println("Subclass constructor called");
    }
}

public class super_constructor {
    public static void main(String[] args) {
        B obj = new B(); 
    }
}
