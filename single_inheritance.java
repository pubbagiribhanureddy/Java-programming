class superclass
{
int a=10,b=20;
void sup_method()
{
System.out.println("This is super class method");
}

}
class subclass extends superclass
{
int c=30;
void display()
{
System.out.println("The given values are:"+a+","+b+ " & " +c);
}
}
class single_inheritance
{
public static void main(String ar[])
{
subclass obj=new subclass();
obj.sup_method();
obj.display();
}
}
