import java.io.*;
class try_with_resource
{
public static void main(String[] args)
{
try(FileWriter fw = new FileWriter("simple.txt"))
{
fw.write("java is a case sensitive programming language ");
System.out.print("data wrote to a file succesfully");
}
catch(Exception e)
{}
}
}

