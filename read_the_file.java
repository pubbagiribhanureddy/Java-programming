import java.io.*;
import java.util.*;
class read_the_file
{
public static void main(String[] args)
{
File f = new File ("simple.txt");
try(Scanner s= new Scanner(f))
{
while(s.hasNextLine())
{
String data = s.nextLine();
System.out.println(data);
}
}
catch(Exception e)
{}
}
}