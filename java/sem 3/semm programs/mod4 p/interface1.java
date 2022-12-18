interface hansi
{
    //hansi()//cannot contain constructors
    //void m2(){}//cannot contain defined methods
    //all methods in interface are public method by defalut not default methods
     void m1();
    default void m2()
    {
        System.out.println("hasni");
    }
    static void  m3()
    {
        int k=1;
        
    }
}
class k implements hansi{
    public void m1()//u need to use public for sure
    {
        System.out.println("implemented in sub class");
    }
    /*default void m2()
    {
        
    }*/
}

class interface1
{
    public static void main(String[] args)
    {
        k obj=new k();
        obj.m1();
        obj.m2();
        //obj.m3();
    }
}