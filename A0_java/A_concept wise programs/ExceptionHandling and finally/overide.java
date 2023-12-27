class hansi
{
    static void hansi1()
    {
        System.out.println("hasni");
    }    
}
class overide extends hansi
{
    static void hansi1()
    {
        System.out.println("from child");
    }
    public static void main(String[] args) {
        overide obj=new overide();
        obj.hansi1();
        

    }
}
