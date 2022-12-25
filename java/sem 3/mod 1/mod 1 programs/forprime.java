import java.util.*;
class forprime 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numner to check whether prime or not");
        int n=sc.nextInt();
        int noofdivisors=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                noofdivisors=noofdivisors+1;
            }
        }
        if(noofdivisors==2)
        {
            System.out.println("entered number "+n+" is a prime number");
        }
        else
        {
            System.out.println("entered number "+n+" is not a prime number");
        }

    }    
}
