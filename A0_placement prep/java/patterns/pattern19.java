package patterns;

public class pattern19 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            for(int k=(i+1);k<=((n*2)-i);k++)
            {
                System.out.print(" ");

            }
            for(int k=((n*2)-i+1);k<=(n*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
