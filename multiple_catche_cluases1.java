class multiple_catche_cluases1
{
    public static void main(String args[])
    {
try
{
   int a[]={1,2,3,4};
   System.out.println(a[10]);
}
catch(Exception e1)
{
   System.out.println("ArrayIndexOutOfBoundsException occurred="+e1.getMessage());
}
try{
    int data=100/0;
    System.out.println(data);
}

catch(ArithmeticException e2)
{
    System.out.println("ArithmeticException occurred="+e2.getMessage());
}
    }
}