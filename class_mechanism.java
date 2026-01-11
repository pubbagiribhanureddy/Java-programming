class method_concept
{
void display()
{
System.out.println("no parameters");
}
void show(int a,int b)
{
System.out.println("a value:"+a);
System.out.println("b value:"+b);
}
}
class class_mechanism
{
public static void main(String args[])
{
method_concept obj = new method_concept();
obj.display();
obj.show(4,5);
}
}