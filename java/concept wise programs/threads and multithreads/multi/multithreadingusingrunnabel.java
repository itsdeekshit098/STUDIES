/*
 diff b/w Thread using 
 */
package multi;
class k implements Runnable
{
    public void run()
    {
        System.out.println("from run");
    }
}
class kk extends Thread
{

}
public class multithreadingusingrunnabel 
{
public static void main(String[] args) 
{
     k obt=new k();
     Thread kkk=new Thread(obt);
     kkk.start();
}    
}
