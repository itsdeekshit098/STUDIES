class hansi   //base class
{
    int a=1;
    void sum()
    {
        System.out.println(a);
    }

}
class hansi1 extends hansi //intermediate class
{
    int b=3;
    void sum1()
    {
        System.out.println(a+b);
    }
}
class hansi2 extends hansi1 //derived class
{
    int c=4;
public static void main(String[] args) {
    hansi2 obj=new hansi2();
    System.out.println(obj.a+obj.b+obj.c);
    obj.sum();//accessing base class method
    obj.sum1();//accessing intermediate class method
    
}
}