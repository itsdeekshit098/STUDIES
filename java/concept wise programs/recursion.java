//calling a function by iself or call a same function in the same function
//or
//The process in which the function or method calling itself directly or indirectly is called recursion and the corresponding function (method) is called recursive function (recursive method).

public class recursion 
{
    int a=10;
    int sum=0;
    int sum(int x)
    {
        if(x>=1)
        {
            sum=x+sum(x-1);
            
        }
        else
        {
            return 0;//see when sum(0) comes as x(0) is not >=1 cursor comes to else part which returns  0 for sum(0)
        }
        return sum;

    }
    public static void main(String args[])
    {
        recursion obj=new recursion();
        System.out.println(obj.sum(obj.a));
    }

    
}
