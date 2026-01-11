class parameters
{
parameters(int rollno,String name)
{
System.out.println("parameterised constructor");
System.out.println("roll no:"+rollno);
System.out.println("student name:"+name);
}
}
class parameterised_constructor
{
public static void main(String args[])
{
System.out.println("student 1 deatails:");
parameters obj1 =new parameters(4789,"bhanu");
System.out.println("student 2 deatails:");
parameters obj2 =new parameters(4789,"bhanu");
}
}