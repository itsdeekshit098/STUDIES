package thread;
class currentthread 
{
    public static void main(String[] args) 
    {
        //int i=1/0;                                      //shows like exception main thread not exception in main method
        Thread s=Thread.currentThread();                //here instance of particular thread is stored in s and also currentThread() returns thread type obj
        String ss=Thread.currentThread().getName();     //getName() method returns string
        System.out.println(s);
        System.out.println(ss);

        //we can even change name of thread
        s.setName("hasni");                         //makes thread name as hasni
        System.out.println(Thread.currentThread().getName());


        
    }
}
