/* package codechef; // don't place package name! */

import java.util.Scanner;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class kkr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x >= (2 * y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}