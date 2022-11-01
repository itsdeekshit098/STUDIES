import java.util.*;

class foreachlooparray {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the siaze of the array note enter size of array is less than 100");
        int size = sc1.nextInt();
        int h = 0;
        int array1[] = new int[100];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element to be inserted at " + i);
            array1[i] = sc1.nextInt();
        }
        System.out.println("enter the element u wanted to search for");
        int ele = sc1.nextInt();
        for (int k : array1) {
            if (array1[k] == ele) {
                h = h + k;
            }
        }
        if (h == 0) {
            System.out.println("element not found");

        } else {
            System.out.println("element is found at" + h);
        }

    }
}