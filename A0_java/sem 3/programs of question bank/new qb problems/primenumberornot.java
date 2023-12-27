import java.util.*;

public class primenumberornot {
    public static void main(String args[]) {
        System.out.println("enter the number u want to check whether prime or not");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int i;
        int j = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                j = j + 1;
            }

        }
        if (j <= 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }

}
