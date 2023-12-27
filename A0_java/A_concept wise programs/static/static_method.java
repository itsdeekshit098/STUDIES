public class static_method {
    static void hansi()
    {
        int x=10;
        System.out.println("from static mtethod");
    }
    public static void main(String args[])
    {
        hansi();//called without creating an object
        System.out.println("from main method");
    }
}
