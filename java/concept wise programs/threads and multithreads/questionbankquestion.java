

//12.Create two threads in which one displays “Dept of CSE” for every 50 seconds and the other displays “ Jain University” for every 100 seconds continuously.

class cse extends Thread 
{
    public void run() 
    {
        try
        {
            int t=10;
            while(t!=0)
                {
                    System.out.println("Dept of CSE");
                    Thread.sleep(50000);
                    t--;
                }
        }
        catch(InterruptedException e)
        {

        }
    }
    
}
class jain implements Runnable
{
    public void run()
    {
        try
        {
            int t=10;
            while(t!=0)
            {
                System.out.println("Jain University");
                Thread.sleep(100000);
            }    
        }
        catch(Exception e)
        {

        }
    }
}

public class questionbankquestion {
    public static void main(String[] args) 
    {
        //initializing first thread
        cse obj=new cse();
        obj.start();

        //initialising second thread
        jain obj2=new jain();
        Thread obj3=new Thread(obj2);
        obj3.start();
    }
    
}
