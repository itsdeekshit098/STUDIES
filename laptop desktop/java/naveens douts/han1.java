import java.util.Scanner;

public class han1 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("1");
        int T = scan1.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("kkr");
            String TeamA = scan2.nextLine();
            System.out.println("kkr2");
            String TeamB = scan2.nextLine();
            System.out.println("kkr3");
            int x = scan1.nextInt();
            System.out.println("kkr4");
            int y = scan1.nextInt();
            if (x == (x - y)) {
                System.out.println(x);
            }
        }
    }
}