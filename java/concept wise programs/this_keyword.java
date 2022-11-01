public class this_keyword {
    int a=1;
    this_keyword()
    {
        System.out.println("from constructor");
    }
    this_keyword(int i)
    {
        this.this_keyword();

    }
    void hansi()
    {
        int a=6;
        System.out.println(this.a);
        System.out.println(a);
    }
    public static void main(String args[])
    {
        
    }

}
