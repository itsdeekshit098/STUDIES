//thread.sleep might through an interrupted exception
public class hadlingcheckedexception 
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread.sleep(10000);
        try{
            int a=1/0;
        }
        catch(Exception e)
        {
            System.out.println("cannot ");
        }
    }
}
