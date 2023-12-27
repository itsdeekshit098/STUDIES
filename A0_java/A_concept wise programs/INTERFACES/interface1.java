interface hansi 
{
    void idly();
    String vada();
    void dosa();
}
class hansi1 implements hansi//NOTE:implemented method(hansi1 here)should implement the unimplemented method of the interface hansi if not should be declared as abstract.
{
    //void idly(){}//shows error bcz in interface everything is public so inorder to implement those the method should be public
    public void idly()
    {
        System.out.println("idly");
    }
    public String vada()
    {
        return "hasni";
    }
    public void  dosa()
    {
        System.out.println("dosa");
    }

}
public class interface1
{
    public static void main(String[] args)
    {
        hansi1 obj=new hansi1();//using reference variable of interface
        obj.idly();
        System.out.println(obj.vada());   
        obj.dosa(); 
    }
}
