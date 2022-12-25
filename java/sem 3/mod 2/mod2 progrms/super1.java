class hasni
{
    int a=10;
}

class super1 extends hasni
{
    int a=11;
    public static void main(String[] args) 
    {
        super1 obj=new super1();
        System.out.println(super.a);
    }
       
}