import java.io.*;
class delete_a_file
{
public static void main(String[] args)
{
try
{
File f = new File("display.txt");
if (f.delete())
{
System.out.println("File deleted successfully");
}
else{
System.out.println("File is not available");
}
}
catch(Exception e)
{}
}
}