package multi;
class childthread111 extends Thread 
{
    public void run()             //run is method of thread
    {
        Thread h=Thread.currentThread();
        for(int i=0;i<5;i++)
        {
            try{
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println("sleep was interrupted");
            }
            
           System.out.println("frim child tread");
        }
    }

}
class mutithreading2
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("main method");
        childthread111 obj=new childthread111();
        try{
        obj.start(); 
        }
        catch(InterruptedException e)                              //from this statemnts two threads comes into picture so then its upto jobscheduler which thread will be executed
        for(int i=0;i<5;i++)
        {
            Thread.sleep(3000);
            System.out.println("from main thread");
        }                   
    }   
}

