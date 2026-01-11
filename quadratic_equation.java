import java.util.*;
class quadratic_equation
{
public static void main(String args[]){
int a,b,c;
double d,root1,root2;
Scanner S =new Scanner(System.in);
System.out.println("enter a value:");
a=S.nextInt();
System.out.println("enter b value:");
b=S.nextInt();
System.out.println("enter c value:");
c=S.nextInt();
d=b*b-4*a*c;
if(d>0)
{
root1=(-b+Math.sqrt(d))/(2*a);
root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("root1:"+root1);
System.out.println("root2:"+root2);
}
else if(d==0)
{
double root;
root=-b/2*a;
System.out.println("root:"+root);
}
else
{
System.out.println("the roots are imaginary");

}
}
}