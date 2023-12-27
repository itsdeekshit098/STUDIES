interface hansi11 
{
    void idly();
    String vada();
    void dosa();
}
class hansi2 implements hansi11//NOTE:implemented method(hansi1 here)should implement the unimplemented method of the interface hansi if not should be declared as abstract.
{
    //void idly(){}//shows error bcz in interface everything is public so inorder to implement those the method should be public
    public void idly()
    {
        System.out.println("idly1");
    }
    public String vada()
    {
        return "hasni1";
    }
    public void  dosa()
    {
        System.out.println("dosa1");
    }

}
class hansi3 extends hansi2//NOTE:CANT EXTEND INTERFACE DIRECTLY
{

}
public class interface2
{
    public static void main(String[] args)
    {
        hansi2 obj=new hansi2();//using reference variable of interface
        obj.idly();
        System.out.println(obj.vada());   
        obj.dosa(); 
    }
}