import java.lang.Math;
import java.util.Scanner;

public class navvensdout4 {
    public static void main(String args[]) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter no of numbers u wnated to print: ");
        int k = sc1.nextInt();
        int i;
        for (i = 1; i <= k; i++) {
            // System.out.println("enter the number for which u wnated to find power");
            // int num1 = sc1.nextInt();
            double a = Math.pow(i, 2);
            int b = (int) a;

            double c = Math.pow(i, 3);
            int d = (int) c;

            System.out.println(i + " " + b + " " + d);
        }

    }
}
