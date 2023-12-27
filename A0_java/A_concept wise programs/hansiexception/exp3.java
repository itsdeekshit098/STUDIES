/*here in this program we are like passing arguments in the consttuctor used in throw */
/*output:
 eventhough passing mssg as argument to constructor in throw it prints that as staement
 to print the passed mssg as description mssg of exception pass that to super class (refer exp4)
 */
class TooYoung3 extends RuntimeException
{
    TooYoung3(String s)
    {
        System.out.println(s);
    }   
}

class TooOld3 extends RuntimeException
{
    TooOld3(String s)
    {
        System.out.println(s);
    }

}
public class exp3
{
    public static void main(String[] args) 
    {
    int age=17;
    if(age<18)
    {
        throw new TooYoung3("ur age is too young to get married");//what throw does is will intialize constuctor and raises exception of Type TooYoung
        /*
        how throws works:
          see in throw u need to pass an throwable obeject(throwable object in the sense which throws exception so as all the exception classes are of throwable type so here TooYoung extends RuntimeException so it is also a throwable object).
        see here we are calling constructor::
          the constructor is specified in the class TooYoung and it will be called
         */
    }
    else
    {
        throw new TooOld3("ur are to old for marriage");
    }
}
}