class try_catch
{
    public static void main(String args[])
    {
        try
        {
            var data =100/0; //may throw exception
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }

}