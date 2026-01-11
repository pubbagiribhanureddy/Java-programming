import java.io.File;
class file_methods
{
public static void main(String[] args)
{
try
{
File f = new File("display.txt");
if (f.exists())
{
System.out.println("File Name : "+f.getName());
System.out.println("File Location : "+f.getAbsolutePath());
System.out.println("File Length : "+f.length());
System.out.println("Is File available to read?"+f.canRead());
System.out.println("Is File available to write?"+f.canWrite());
}
else{
System.out.println("File is not available");
}
}
catch(Exception e)
{}
}
}