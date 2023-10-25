 class passingthisinconstructor 
{
    passingthisinconstructor(passingthisinconstructor obj)
    {
        System.out.println("default constructor is invoked");
    }
    passingthisinconstructor(int s)
    {
        System.out.println("entered no is "+s);
    }
    public static void main(String[] args) {
        passingthisinconstructor obj=new passingthisinconstructor(this);
    }
}
