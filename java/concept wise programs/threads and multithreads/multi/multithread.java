/*
NOTE:

 multithreading
  1)to create multiple thread we use 1)extending Thread class
                                     2)implemnting runnable interface
  2)note this point 
                            interface runnabe   //coantains unimplemented  run() and default start()
                            {
                                void run();
                                default void start()
                                {
                                    //i think it contains some lines of code which calls run() so that in code we are able to call statements       
                                     written in public void run by by using obj.start()
                                }
                            }
                     ))))))) next Thread class implements Runnable implicitly so that eventhough if we extend Thread class we can do multithreading
                            class Thread implements Runnable
                            {
                                public void run
                                {
                                    //with no code just implemted with nothinh
                                }
                                //default start method will be there by default we cant override it bcz all fields in interface are final except 
                                 unimplemeted methods
                            }
                    )))))))) so then if any class extends Thread means it is implemeting Runnable implicitly

    3)then we can get dout like as Thread is implemetning Runnable again why cant we implement Runnable instead extending runnable all the time the 
    ans is see if u implement Runnable then for sure u need to define run() method whereas in the case of extending thread u need to define run() bcz in Thread class run() method is defined with no code
                
 */
package multi;

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
