import java.util.Scanner;

public class overlioading {
    public static void hi(int a, int b) {
        System.out.println("1");
    }

    public static void hi(int a, int b, int c) {
        System.out.println("2");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many interger u want to enter: 2 0r 3");
        int l = sc.nextInt();
        switch (l) {
            case 2: {
                System.out.println("enter value of a");
                int a = sc.nextInt();
                System.out.println("enter value of b");
                int b = sc.nextInt();
                hi(a, b);
                break;
            }

            case 3:
                System.out.println("enter value of a");
                int a = sc.nextInt();
                System.out.println("enter value of b");
                int b = sc.nextInt();
                System.out.println("enter the value of c");
                int c = sc.nextInt();
                hi(a, b, c);
        }

    }

}
