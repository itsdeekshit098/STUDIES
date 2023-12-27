package conceptwiserevision.patternquestion;

public class pat10 
{
    public static void main(String[] args) {
        int k=1;
        int l=8;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(j<=k || j>=l)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            k++;
            l--;
            System.out.print("\n");
        }
        int m=4;
        int n=4;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(j<=m || j>=n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            n++;
            m--;
            System.out.print("\n");
        }

    }
}
