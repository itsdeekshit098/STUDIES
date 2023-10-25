class outer11  
{
    int outervar1=1;
    private int outervar2=1;

    class inner11
    {
        int innervar=3;
        void hasni()
        {
            System.out.println(outervar1);//accessing default variable
            System.out.println(outervar2);//accessig private variable
        }
    }
    
}
class main{
    public static void main(String[] args) 
    {
        //1))
        outer11 kk=new outer11();//creating phy existence and assigning to k
        outer11.inner11 rr =kk.new inner11();
        //accessing inner class variable
        //System.out.println(kk.has);invalid bcz phy existence of has will be in rr
        System.out.println(rr.innervar);
        //accessing outer class variable
        //System.out.println(rr.var11);invalid bcz phy existence of var11 is in kk
        System.out.println(kk.outervar1);

        //2))
        outer11.inner11 obj=new outer11().new inner11();
        System.out.println(obj.innervar);
        //System.out.println(obj.outervar);not possible

        
    }
}
