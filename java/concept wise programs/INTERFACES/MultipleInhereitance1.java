interface ij1
{
    void dosa();
}
interface ij2
{
    void idly();
}

class hasni1234 implements ij1,ij2
{
    public void dosa()
    {
        System.out.println("dosa");
    }
    public void idly()
    {
        System.out.println("idly");
    }
}
public class MultipleInhereitance1 {
    public static void main(String[] args)
    {
        hasni1234 obj=new hasni1234();
        obj.dosa();
        obj.idly();
    }
    
    
}
