import java.util.Scanner;

public class leapyear {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the year u want to check ");
        int k = sc1.nextInt();
        if (k % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }

    }
}