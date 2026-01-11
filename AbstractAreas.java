abstract class Figure  
{  
   double dim1;  
   double dim2;  
   Figure (double a, double b)  
  {  
     dim1 = a;  
    dim2 = b;  
  }  
  abstract double area ();    
} 
class Rectangle extends Figure  
{   
   Rectangle (double a, double b)  
  {  
   super (a, b);  
   }  
  double area ()    
  {  
   System.out.println ("Inside Area of Rectangle.");  
    return dim1 * dim2;  
  }  
 }
class Triangle extends Figure  
{   
 Triangle (double a, double b)  
  {  
   super (a, b);  
  }  
  double area()     
  {  
   System.out.println ("Inside Area of Triangle.");  
    return dim1 * dim2 / 2;  
  }  
} 
class AbstractAreas  
{   
  public static void main(String args[])  
  {  
   // Figure f = new Figure(9, 5);  
    Rectangle r = new Rectangle(2, 4);  
    Triangle t = new Triangle(7, 5);  
    System.out.println("Area is " + r.area());  
    System.out.println("Area is " + t.area());  
  }  
}
