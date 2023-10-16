package interfaces;
interface x
{
    void  area(int x);
}
class y implements x
{
    int a;
    public  void area(int b)
    {
        this.a=b;
    }
}
public class Main 
{
    public static void main(String[] args) {
        y obj= new y();
        obj.area(2);
        System.out.println(obj.a);
        boolean x1=TRUE;
    }
}
