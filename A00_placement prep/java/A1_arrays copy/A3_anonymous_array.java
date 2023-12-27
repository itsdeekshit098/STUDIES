import java.util.Arrays;

public class A3_anonymous_array 
{
    static void a(int a[])
    {
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) 
    {   
        a(new int[]{1,2,3,4,5});
    }
}
