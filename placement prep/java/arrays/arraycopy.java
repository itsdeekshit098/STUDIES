package arrays;

import java.util.Arrays;

public class arraycopy {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]=new int[3];
        System.arraycopy(a, 0, b, 0, 3);
        System.out.println(Arrays.toString(b));
    }
}
