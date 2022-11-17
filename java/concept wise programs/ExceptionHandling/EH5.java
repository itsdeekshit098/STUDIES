import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

//nested try 
class EH5
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
            catch(ArrayStoreException e)
            {
                System.out.println("error from Exception");
            }
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("AE from outer catch block");
        }
        catch(NullPointerException e)
        {
            System.out.println("NE from outer catch block");
        }
    
    }
  
}
