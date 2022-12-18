class hansi11
{
    void kkr()
    {
        System.out.println("hasni");
    }
}
public class override extends hansi11
{
    void kkr()
    {
        System.out.println("hasni");
        System.out.println("tdr");
    }
    public static void main(String[] args) {
        override obj=new override();
        obj.kkr();
    }
}
