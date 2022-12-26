class a
{
    void m1()
    {
        System.out.println("from a");
    }
}
class b extends a
{
    void m1()
    {
        System.out.println("from c");
    }
}
class c extends b
{
    void kkr()
    {
        this.m1();
    }
}
class multipleinheritance
{
public static void main(String[] args) 
{
        c obj=new c();
        obj.kkr();
}

}