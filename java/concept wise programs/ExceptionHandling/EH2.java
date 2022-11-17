//multiple catch
class EH2
{
    public static void main(String[] args) 
    {
        try{
            int a[]={1,2,3,4};
            System.out.println(a[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index out of bounds");
        }
    }
    //here the catch block with that exception is called
    
}
