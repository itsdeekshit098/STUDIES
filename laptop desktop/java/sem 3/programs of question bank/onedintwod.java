/*
Write a java program to print the matrix as follows ( CO1)
1
1 1
1 1 1
*/

public class onedintwod {
    public static void main(String args[]) {
        int a[][] = new int[3][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                a[i][j] = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");// if u use print ln cursor goes to next line then new line will be printed
        }

    }

}
