class passingthisinjava 
{
    void m1(passingthisinjava obj)
    {
        System.out.println("m1 method invoked ");
    }  
    void m2()
    {
        m1(this);
    }  
    public static void main(String[] args) 
    {
        passingthisinjava obj=new passingthisinjava();
        obj.m2();
    }
}