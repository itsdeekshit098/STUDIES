package conceptwiserevision.patternquestion;

public class pat11 
{
    public static void main(String[] args)
    {
        int x=5;
        int y=9;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=9;j++)
            {
                if(j>=x && j<=y)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            x--;
            y--;
            System.out.print("\n");
        }
    }
}
