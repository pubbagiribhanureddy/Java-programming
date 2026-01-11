class bultin_exceptions_unchecked
{
public static void main(String args[])
{
int a=10,b=0,c;
try
{
c=a/b;
System.out.println(c);
}
catch(Exception e)
{
System.out.println("Exception Caught:"+e.getMessage());
}
finally
{
System.out.println("Addition:"+(a+a));
System.out.println("Multiplication:"+(a*a));
}
}
}
