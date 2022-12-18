import java.util.Scanner;
public class fibonacciseriesusingwhile 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int fv=0;
        int sv=1;
        int nv=0;
        System.out.println("enter no of fibonacci series elements u wanted to print");
        int n=sc.nextInt();
        int i=0;
        while(i<n)
        {
            System.out.println(fv);
            nv=fv+sv;
            fv=sv;
            sv=nv;
            i++;
        }    
    }
}
