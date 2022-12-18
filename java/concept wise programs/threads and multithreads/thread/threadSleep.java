package thread;
/*
 see Thread.sleep(milliseconds(1000ms=1sec)): makes the thread to sleep for given no of ms
 NOTE:when compiler goes to thread.sleep line then sleep process starts

 exp for below program:
    1)currentThread instance have been assigned to h.why this is for some mothod we cant perform with thread directly
    2)before supposed to have "System.out.println("before thread.sleep() method");" to get get clarity of thread isnt sleep yet(if statement printed without delay sleep isnt started if not aleep has started)
    3)used for loop in that to make thread sleep 
    4)see as sleep started hansi will be printed with delay of 5 sec then again i++ i becomes then thread.sleep will be initialised again then again 5 sec gap and then prints hansi and so on until i=4 then sleeps for 5 sec then exits for loop so then kkr will be printed 
    5)NOTE:if thread.sleep has been above for loop then after printing before thread.sleep() method thread goes for sleep for 5 sec then for loop and sout statement will be completed without delay
 */
public class threadSleep 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Thread h=Thread.currentThread();
        System.out.println("before thread.sleep() method");
        //Thread.sleep(5000)
        for(int i=0;i<5;i++)
        {
            Thread.sleep(5000);//or h.sleep(5000)         //make the thread sleep for 5 seconds
            System.out.println("hansi");
        }
        System.out.println("kkr");
    }
}
