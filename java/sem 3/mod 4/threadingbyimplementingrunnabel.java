class vr implements Runnable
{
    public void run()
    {
        System.out.println("from thread created by runnable");

    }
}
public class threadingbyimplementingrunnabel 
{
    public static void main(String[] args) {
        vr obj=new vr();
        Thread th=new Thread(obj);
        th.start();

        Thread th1=new Thread(obj);
        th1.start();
    }  
}
