class alive_concept extends Thread
{
public void run()
{
System.out.println("IS Alive concept()");
}
public static void main(String[] args)
{
alive_concept obj =new alive_concept();
alive_concept obj1=new alive_concept();
obj.start();
System.out.println(obj.isAlive());
//obj1.start();
System.out.println(obj1.isAlive());
}
}