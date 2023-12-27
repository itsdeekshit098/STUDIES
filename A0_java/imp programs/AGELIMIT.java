//problem link:
import java.util.Scanner;

public class AGELIMIT {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        //System.out.println("no of test cases");
        int T = sc1.nextInt();
        while (T > 0) {
            int X = sc1.nextInt();
            int Y = sc1.nextInt();
            int A = sc1.nextInt();
            if (A >= X && A < Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;

        }

    }
}
