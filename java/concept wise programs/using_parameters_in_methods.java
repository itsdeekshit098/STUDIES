
public class using_parameters_in_methods {
    static double areaofsquare(int side_length)
    {
        double area; //used double bcz if u enter size length value as max value int data type then its square wont be in range of int type so then it will be somewhat in range of double so as we cannot type cast double into int i.,e from math.pow() doub;e  to int area so we declared area as double
        area=Math.pow(side_length,2);
        //area=int 
        return area;
    }
    public static void main(String args[])
    {
        System.out.println("area of square is "+areaofsquare(4));

    }
}

