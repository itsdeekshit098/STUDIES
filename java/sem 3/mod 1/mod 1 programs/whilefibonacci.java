
import java.util.Scanner;
class whilefibonacci 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("no of fibonacci squence u want");
        int n=sc.nextInt();
        int ft=0;
        int st=1;
        int nt=0;
        while(i<=n)
        {
            System.out.println(ft);
            nt=ft+st;
            ft=st;
            st=nt;
            i++;
        }
    }    
}
