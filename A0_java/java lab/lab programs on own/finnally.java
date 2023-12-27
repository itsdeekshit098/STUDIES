public class finnally {
    public static void main(String[] args) {
        try
        {
            System.out.println(1/0);
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());//if i comment out this it will be like catch with no mssg to be printed 
        }
    }
}
