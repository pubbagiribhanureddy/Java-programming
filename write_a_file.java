import java.io.*;
class write_a_file
{
public static void main(String[] args)
{
try
{
FileWriter fw = new FileWriter("simple.txt");
fw.write("object oriented programming through JAVA");
fw.close();
System.out.println("data added into a file successfully");
}
catch(Exception e)
{}
}
}
