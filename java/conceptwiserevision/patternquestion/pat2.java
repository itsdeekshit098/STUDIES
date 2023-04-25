package conceptwiserevision.patternquestion;

public class pat2 
{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            if(i==1||i==4)
            {
                for(int j=1;j<=5;j++)
                {
                    System.out.print("*");
                }
                
            }
            else
            {
                for(int k=1;k<=5;k++)
                {
                    if(k==1 || k==5)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
            
        }
    }
//or amother answer 
//as we see the image where ever i==1 or j==1 or i==n(4) or j===m(5) star is being printed so the answer might also be the below one
    void anotheranswer()
    {
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || j==1 || i==n || j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            System.out.println();
        }
    }
}

