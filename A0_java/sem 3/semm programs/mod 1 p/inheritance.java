class hans//super class
{
    int k=1;
    void sum()
    {
        System.out.println(k+1);
    }
}

class chinnu extends hans  //sub class
{
    int r=4;
    public static void main(String[] args) {
        chinnu obj=new chinnu();
        System.out.println(obj.r+obj.k);//adding var of super class and sub class
        obj.sum();//calling method of super class 
    }
}