import java.util.Arrays;

public class A4_returning_an_array_from_the_method {
    static int[] method1(int a[])
    {
        return a;
    }
    public static void main(String[] args) {
        method1(new int[]{1,2,3});
        //below code doesnt works bcz In your original code, you attempted to print Arrays.toString(method1). The reason this doesn't work is that method1 is a method, not an array. Arrays.toString(...) is a method that expects an array as an argument to convert the array into a string for printing.
        //System.out.println(Arrays.toString(method1));//
        // so let us assign the method returning value which is arr to a array
        int arr1[]=method1(new int[]{1,2,3});
        System.out.println("the array returned to method1 is ");
        System.out.println("without using Arrays.toString");
        System.out.println(arr1);
        System.out.println("by using Arrays.toString");
        System.out.println(Arrays.toString(arr1));
    }
}
