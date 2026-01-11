class overload
{
 protected int a,b;
 public overload()
 {
  a=10;
  b=20;
 }
 public overload(int x)
 {
   a=x;
   b=5; 
 }
 public overload(int x,int y)
 {
  a=x;
  b=y;
 }
 public void print()
 {
  System.out.println("Area: "+(a*b));
 }
}
class constructor_overload
{
public static void main(String args[])
 {
  overload o=new overload();
  o.print();
  overload o1=new overload(50);
  o1.print();
  overload o2=new overload(50,5);
  o2.print();
  
 }
}