class outer1  
{
    int var1=1;
    private int var2=1;

    class inner1
    {
        void hasni()
        {
            System.out.println(var1);//accessing default variable
            System.out.println(var2);//accessig private variable
        }
    }
    public static void main(String[] args) 
    {
        //1))
        outer1 k=new outer1();//creating phy existence and assigning to k
        //NOTE only if psvm is in 
        inner1 r=k.new inner1();//see from objofouter created we are creating the phyexistence of inner(i.e., why k.new inner1())
        System.out.println(k.var1);
        
        
    }
}

