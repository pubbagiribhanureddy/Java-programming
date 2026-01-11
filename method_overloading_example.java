class student_details
{
void method_overloading()
{
System.out.println("no parameters");
}
void method_overloading(int rollno)
{
System.out.println("one parameter");
System.out.println("Roll no:"+rollno);
}
void method_overloading(int rollno,String name)
{
System.out.println("two parameters");
System.out.println("Roll no:"+rollno);
System.out.println("name of the student:"+name);
}
void method_overloading(int rollno,String name,double marks)
{
System.out.println("three parameters");
System.out.println("Roll no:"+rollno);
System.out.println("name of the student:"+name);
System.out.println("marks:"+marks);
}
}
class method_overloading_example
{
public static void main(String args[])
{
student_details obj =new student_details();
obj.method_overloading();
obj.method_overloading(4789);
obj.method_overloading(4789,"bhanu");
obj.method_overloading(4789,"bhanu",8.0);
}
}