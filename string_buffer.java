class string_buffer
{
public static void main(String args[])
{
StringBuffer sb1=new StringBuffer("hello World");
sb1.delete(0,1);
System.out.println(sb1);
StringBuffer sb2=new StringBuffer("Some Content");
sb2.delete(0,sb2.length());
System.out.println(sb2);
StringBuffer sb3=new StringBuffer("Bhanu Prakash");
sb3.deleteCharAt(0);
System.out.println(sb3);
}
}