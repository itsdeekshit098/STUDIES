public class overloading_constructor {
    overloading_constructor(int x,int y,int z)
        {
            System.out.println("the sum in 3 parameters constructor is  "+(x+y+z));
        }
    overloading_constructor(int x,int y)
        {
            System.out.println("the sum in 2 parameters constructor is  "+(x+y));
        }  
    public static void main(String args[])
    {
        overloading_constructor obj=new overloading_constructor(2, 1);
        overloading_constructor obj1=new overloading_constructor(1,2,3);

    }

}
/*            DIFF b/w constructor overloading and method overloading or constructor and methods
        1)see in method overloading if u call method with some x arguments then compiler checks method linearly and if a particular method matches then it goes into it
        but in case of consstructor if u call a constructor with x no of arguments then compiler goes directly to the constructor with that no of  parameters
        2)in methods we can create a obj once and call object with different arguments
        like
        class obj=new class()
        obj.hansi(1,2) 
        obj.hansi(1,3)
        but in constructors
             regarding constructor  we can pass only one set of arguments to one obj created bcz as constructor is initialized while obj is created so we cannot use the same obj to call with different arguments like in methods.s
*/