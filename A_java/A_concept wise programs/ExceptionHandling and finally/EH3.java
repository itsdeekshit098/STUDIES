//playing with multiple catch
//here what happens is control goes to try then from 1/0 exception raised so to catch block of that calss as ArithmeticEception is first than Exception(eventhough exception calss holds arithmetic exception)so goes to arithmetic exception.

//but if u put exception class catch first and arithmeticexception class catch next to parent class exception what happens is it shows error like  ""Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception""" it means that control reached arithmeticException in route of exception so again it cant be handled in direct route(try by cahnging once for clarity)
class EH3
{
    public static void main(String[] args) 
    {
        try{
            int a1=1/0;
            int a[]={1,2,3,4}; 
            System.out.println(a[4]);
        } 
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
        }
        catch(Exception e)//as arithmeticException is a subclass of Exception class it contain AE also
        {
            System.out.println("mssg from  exception class");

        }
       
       
    }
    //here the catch block with that exception is called
    
}
