import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NONNEGPROD {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of test cases");
        int T = sc.nextInt();
        int i;
        int k, j, l;
        k = 0;
        l = 0;
        for (i = 0; i < T; i++) {
            System.out.println("enter the  the number of elements in the array originally.");
            int N = sc.nextInt();
            int array11[] = {};
            System.out.println();
            for (j = 0; j < N; j++) {
                System.out.println("enter the element " + i);
                array11[i] = sc.nextInt();

            }
        }

    }
}
