interface Animal{
public abstract void moves();
}
interface bird{
void fly();
}
public class subclass implements Animal,bird
{
public void moves()
{
System.out.println("animals move on land");
}
public void fly()
{
System.out.println("birds fly in air");
}
public static void main(String args[])
{
subclass obj =new subclass();
obj.moves();
obj.fly();
}
}