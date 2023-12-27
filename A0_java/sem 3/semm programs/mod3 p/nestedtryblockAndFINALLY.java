//in nested try  if the catch of nested try doesnt catch the exception if the catch of outside catch is of same type then it catches that exception
/*
 finally:
    finally is used in such a case where u want to do something whether  an exception is arised or not in both cases for example if u want to stop the database connetion normally after completion of task and also even an exception arises
 */
class nestedtryblockAndFINALLY
{
public static void main(String[] args) {
    try
    {
        int a[]={1,2,3};
        //System.out.println(a[3]);
        try
        {
            //System.out.println(1/0);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("hasni");
        }
    }
    catch(ArithmeticException e)
    {
        System.out.println("hi");
    }
    finally{
        System.out.println("finally is executed even after exception in main thread is arised in this program");
        
    }
} 
}