package patterns;
import java.util.Scanner;
class pattern9 {
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=(n+i);j++)
            {
                
                if(i==0 && j==n)
                {
                    System.out.print("*");
                }
                else if(j>=(n-i)&& j<=(n+i))
                {
                    if((n-i)%2==0)
                    {
                        if(j%2==0)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    else if((n-i)%2!=0)
                    {
                        if(j%2!=0)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n+(n-i));j++)
            {
                if(j==n && i==n)
                {
                    System.out.print("*");
                }
                else if(j>=(n-(n-i))&& j<=(n+(n-i)))
                {
                    if((n-(n-i))%2==0)
                    {
                        if(j%2==0)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    else if((n-(n-i)%2!=0))
                    {
                        if(j%2!=0)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
}