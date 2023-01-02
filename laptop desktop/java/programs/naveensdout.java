import java.lang.Math;
import java.util.Scanner;

public class naveensdout {
    public static void hasni() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter no of numbers u wnated to print: ");
        int non = sc1.nextInt();
        int i;
        for (i = 0; i < non; i++) {
            System.out.println("enter the number for which u wnated to find power");
            int num1 = sc1.nextInt();
            double a = Math.pow(num1, 2);
            int b = (int) a;

            double c = Math.pow(num1, 3);
            int d = (int) c;

            System.out.println(num1 + " " + b + " " + d);

        }

    }

    public static void main(String args[]) {
        hasni();

    }

}
