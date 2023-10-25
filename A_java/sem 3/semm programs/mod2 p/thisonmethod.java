class thisonmethod 
{
    void m1()
    {
        System.out.println("m1 method invoked ");
    }  
    void m2()
    {
        this.m1();
    }  
    public static void main(String[] args) 
    {
        thisonmethod obj=new thisonmethod();
        obj.m2();
    }
}