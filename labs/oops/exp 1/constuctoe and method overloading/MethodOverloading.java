/*
NOTE:
    use f for declaring float values: ex :: 34.9f or else it will assume as double
 THERE ARE MANY TYPES OF METHOD OVERLOADING BUT HERE WE WILL DICUSS ONLY METHOD OVERLOADING BY:
    1)method overloading with diff in no of arguments
    2)method overloading with changing in data type of arguments eventhough there are of the same type

 */
public class MethodOverloading 
{ 
    //method overloading with diff in no of arguments
    void hansi()
    {
        System.out.println("from un parameterized constrctor");
    }
    void hansi(int k)
    {
        System.out.println("from parameterized method");
        System.out.println("the value u entered is "+k);
    }

    //2)method overloading with changing in data type of arguments eventhough there are of the same type
    //in this what matters is if u are using two methods with same no of arguments then what u need to do is 
            //us can use same variables(bcz no duplication error will be shown bcz scope will be different) but data types need to be different
    void chinnu(int k,int d)
    {
        System.out.println("from int");
    }
    void chinnu(int k,float i)//void chinnu(int k,float d)
    {
        System.out.println("from int and string");
    }

    public static void main(String[] args) 
    {
        MethodOverloading h=new MethodOverloading();
        h.hansi();
        h.hansi(4);
        MethodOverloading t=new MethodOverloading();
        t.chinnu(1,1);
        t.chinnu(1,1.0f);

        
        
    }
}
