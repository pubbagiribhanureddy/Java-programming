class A extends Thread
{
    synchronized public void run()
    {
        try{
            while(true)
            {
                sleep(1000);
                System.out.println("Good morning");
            }     
            }
            catch(Exception e)
            {}
        }
    }
    class B extends Thread
{
    synchronized public void run()
    {
        try{
            while(true)
            {
                sleep(2000);
                System.out.println("Hello");
            }     
            }
            catch(Exception e)
            {}
        }
    }
    class C extends Thread
{
    synchronized public void run()
    {
        try{
            while(true)
            {
                sleep(3000);
                System.out.println("welcome");
            }     
            }
            catch(Exception e)
            {}
        }
    }
public class Threaddemo
 {
    public static void main(String args[])
    {
        A t1=new A();
        B t2=new B();
        C t3=new C();
        t1.start();
        t2.start();
        t3.start();
    }
}