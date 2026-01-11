class example
{
void add(int x,int y)
{
System.out.println("add= "+(x+y));
}
void div(float a,float b)
{
System.out.println("Division= "+(a/b));
add(10,20);
}
void name(String A)
{
System.out.println("name= "+A);
div(5,7);
}
}
class MainH
{
public static void main(String args[])
{
example ex=new example();
ex.name("Hai");
}
}