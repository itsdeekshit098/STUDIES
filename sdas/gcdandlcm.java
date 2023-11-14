public class gcdandlcm
{
    public static void main(String[] args) 
    {
        int a=2;
        int b=7;

        long v1=b;
        long v2=a;
        while(v2>0)
        {
            long temp=v2;
            v2=v1%v2;
            v1=temp;
        }
        System.out.println(v1);
    }
}