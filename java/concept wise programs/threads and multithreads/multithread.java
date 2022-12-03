
class childthread extends Thread
{
    public void run()                 //run is method of
    {
        for(int i=0;i<5;i++)
        {
        System.out.println("frim child tread");
        }
    }

    public void kkr()
    {
        System.out.println("hansi");
    }

}
class mutithreading
{
    public static void main(String[] args) throws Exception
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("from main thread");
        } 
        childthread obj=new childthread(); //bornstate
        //here in below line u might get dout like why obj.start i can call run method by obj.run() directly but what happens is it becomes method call not bringing thread into runnable state. 
        obj.start();//we need to start to make it  in runnable state                     
    }   
}
/*
 exp:
1)jvm identifies main method then main thread comes into picture it starts executing what all in main method for loop will be executed then childthread class obj is created then from obj.start what all enclosed in public void run() only  will be runned or executed with obj.start() method
 */
