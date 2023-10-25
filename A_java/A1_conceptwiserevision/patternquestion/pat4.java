package conceptwiserevision.patternquestion;

public class pat4 
{
    public static void main(String[] args) 
    {
        int n=4;
        while(n>=0)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            n--;
        }
        secondmethod();
    }
    //using only for loops
    static void secondmethod()
    {
        System.out.println("using only loops");
        int n=4;
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        System.out.print("\n");
        }
    }
}
