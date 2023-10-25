import java.util.*;
import java.lang.*;
import java.io.*;

public class FLIPCARDS {

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i;
        for (i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if (X > N - X) {
                System.out.println(N - X);
            }

            else if (X < N - X) {
                System.out.println(X);

            } else {
                System.out.println(X);
            }
        }
    }
}
