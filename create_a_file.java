
import java.io.File;
class create_a_file
{
public static void main(String[] args)
{
try
{
File f = new File("display.txt");
if (f.createNewFile())
{
System.out.println("File created successfully");
}
else{
System.out.println("File already exist or invalid");
}
}
catch(Exception e)
{}
}
}