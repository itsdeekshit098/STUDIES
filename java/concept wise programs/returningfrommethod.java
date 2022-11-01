import java.lang.Math;
import java.util.*;
public class returningfrommethod {
    static int side_length;
    static double areaofsquare()
    {
        double area; //used double bcz if u enter size length value as max value int data type then its square wont be in range of int type so then it will be somewhat in range of double so as we cannot type cast double into int i.,e from math.pow() doub;e  to int area so we declared area as double
        area=Math.pow(side_length,2);
        //area=int 
        return area;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        side_length=sc.nextInt();
        System.out.println("area of square is "+areaofsquare());

    }
}
