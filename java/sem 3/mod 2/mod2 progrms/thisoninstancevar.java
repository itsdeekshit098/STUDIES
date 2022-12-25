public class thisoninstancevar 
{
int k=1;
void m1()
{
    System.out.println("from m1");
}
void m2()
{
    System.out.println("in m2");
    this.m1();
} 
public static void main(String[] args)
 {
    thisoninstancevar obj=new thisoninstancevar();
    obj.m2();
}   
}
