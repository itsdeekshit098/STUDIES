import java.util.*;

public class fibonacciseries {
    public static void main(String args[]) {
        int n;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number of numbebers fibonacci series sequence ");
        n = sc1.nextInt();
        int i = 1;
        int firstterm = 0;
        int secondterm = 1;
        while (i <=n)                 //here <= bcz above i declared i as 1 it is not 0
        { 
            System.out.println(firstterm);
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
            i = i + 1;
        }
    }

}
