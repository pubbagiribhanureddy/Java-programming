class X
{
int rollno=4763;
}
class Y extends X
{
String name="Mohammad";
}
class Z extends Y
{
String college="VVITU";
void display()
{
System.out.println("Roll Number= "+rollno+ "  Name= "+ name+ "  College= "+college);
}
}
class multilevel_inheritance
{
public static void main(String ar[])
{
Z obj=new Z();
obj.display();
}
} 
