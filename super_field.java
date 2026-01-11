class Parent {
    int number = 10;
}
class Child extends Parent 
 {
    int number = 20;
    void showNumber() 
{
        System.out.println(super.number); // Accesses Parent's number
    }
}
class super_field
{
public static void main(String args[])
{
Child obj=new Child();
obj.showNumber();
}
}
