/*
26. Write a java program to print a unit matrix as follows ( CO1)
1 0 0
0 1 0
1 0 1
*/
public class twod {
    public static void main(String args[]) {
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
