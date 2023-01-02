import java.util.Scanner;

public class SUMNEQ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j, k;
        k = 0;
        for (i = 1; i < N; i++) {
            for (j = 1; j < N; j++) {
                if (i + j == N) {
                    k = k + 1;
                } else {
                    k = k;
                }
            }
        }
        System.out.println(k);

    }

}
