public class parameterized_constructors {
    parameterized_constructors(int x,int y)
    {
        int sum=x+y;
        System.out.println("sum is "+sum);

    } 
    public static void main(String args[])
    {
        parameterized_constructors obj=new parameterized_constructors(8, 9);
        parameterized_constructors obj1=new parameterized_constructors(9, 9);
        parameterized_constructors obj6=new parameterized_constructors(9, 9);
        //see like this u can create n no of objects and pass arguments easily
    }
}
