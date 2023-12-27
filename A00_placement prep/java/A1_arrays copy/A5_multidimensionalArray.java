import java.util.Arrays;

public class A5_multidimensionalArray {
    public static void main(String[] args) {
        int []a[]={{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(a));//The Arrays.toString(a) method is trying to convert the entire two-dimensional array into a string. However, this won't give you meaningful output, and the result might look like garbage values. When you use Arrays.toString(a) directly on a multi-dimensional array, it converts the outer array to a string, showing the memory reference of the array object, rather than the individual elements.
    }
}
