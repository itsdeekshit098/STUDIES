class hansi
{
    public static void hansi()
    {
        System.out.println("from hasni clss");
    }
}
class methodoveridinginsubclass extends hansi
{
    public static void hansi()
    {
        System.out.println("from hansi in sub class");
    }
    public static void main(String[] args) 
    {
        hansi();
    }
    
}