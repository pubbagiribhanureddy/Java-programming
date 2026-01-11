import java.io.*;
class append_to_file
{
public static void main(String[] args)
{
try(FileWriter fw = new FileWriter("simple.txt",true))
{
fw.write("\nInternet of things,cyber security including block chain technology\n");
System.out.print("data added into a file succesfully");
}
catch(Exception e)
{}
}
}