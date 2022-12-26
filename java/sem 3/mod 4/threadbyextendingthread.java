class x extends Thread
{
    public void run()
    {
        System.out.println("from x thread");
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
}
class threadbyextendingthread 
{
    public static void main(String[] args) 
    {
        System.out.println("from main thread");
        x obj=new x();
        obj.start();
    }
}
