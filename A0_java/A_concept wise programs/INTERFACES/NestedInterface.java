//unable to create objects
interface outer
{
    interface inner
    {
        void kkr21();
    }
    void kkr22();
}
//implementing inner interface
/*
 while implementing inner interface then no need of to implements fields of outer
 */
class tdr implements outer.inner   
{
    public void kkr21()
    {
        System.out.println("kkr22");
    }
}
//implementing outer interface
class tdr2 implements outer   
{
    public void kkr22()
    {
        System.out.println("kkr22");
    }
}

public class NestedInterface 
{
    tdr obj=new tdr();
    //obj.kkr21();
    //obj.kkr21();
    tdr2 obj1=new tdr2();
    obj1.kkr22();

}
