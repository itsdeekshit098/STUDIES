import java.util.*;

public class factorialofanumberusingforloop {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number to which factorial need to be finded");
        int n = sc1.nextInt();
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i = i + 1;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

}
