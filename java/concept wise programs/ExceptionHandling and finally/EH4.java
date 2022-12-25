//nested try 
class EH4
{
    public static void main(String[] args) 
    {
        try{
            try
            {
                System.out.println(1/0);
                int a[]={1,2,3};
                System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("AIOB from inner catch block");
            }
            catch(NullPointerException eNullPointerException)
            {
                System.out.println("error from Exception");
            }
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("AE from outer catch block");
        }
    
    }
  
}