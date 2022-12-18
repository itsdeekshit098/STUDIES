package multi;
class childthread11 extends Thread 
{

    public void run()                 //run is method of thread
    {
        Thread h=Thread.currentThread();
        for(int i=0;i<5;i++)
        {
           System.out.println("frim child tread");
        }
    }
    //public void start()  //start is a default method of interface  runnable it means in interface runnable default void start(){//with some defination will be therer}
    //{
   //     System.out.println("hasni");
   // }

}
class mutithreading1
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("main method");
        childthread11 obj=new childthread11();
        Thread.sleep(3000);
        obj.start();                               //from this statemnts two threads comes into picture so then its upto jobscheduler which thread will be executed
        for(int i=0;i<5;i++)
        {
            System.out.println("from main thread");
        } 
                         //bornstate
                                               //we need to start to make it  in runnable state                        
    }   
}
