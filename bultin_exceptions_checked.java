class bultin_exceptions_checked
{
public static void main(String args[])
{
int a[]={10,20,30};
try
{
System.out.println(a[6]);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
