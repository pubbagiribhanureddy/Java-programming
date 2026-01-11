class arthematic
{
 void add(int a, int b)
 {
  System.out.println("Add="+(a+b));
}
void sub(int a, int b)
{
 add(a,b);
System.out.println("Sub="+(a-b));
}
}
class arthematic_main
{
public static void main(String args[])
{
arthematic ar=new arthematic();
ar.sub(20,10);
}
}