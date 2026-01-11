class construct
{
int a=20,b= 30;
construct()
{
System.out.println("it is a default constructor");
System.out.println(a*b);
}
}
class default_constructor
{
public static void main(String args[])
{
construct obj =new construct();
}
}