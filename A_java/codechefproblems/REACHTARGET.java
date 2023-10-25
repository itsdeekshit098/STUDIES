import java.util.Scanner;

public class REACHTARGET {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        int T = sc1.nextInt();
        int i;
        for (i = 0; i < T; i++) {
            int X = sc1.nextInt();
            int Y = sc1.nextInt();
            int B = X - Y;
            System.out.println(B);
        }

    }
}
