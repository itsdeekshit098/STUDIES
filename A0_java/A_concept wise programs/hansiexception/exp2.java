/*
 Here in this program we will throw arithmeticException
 */
class ArithmeticException extends RuntimeException//here ArithmeticException must include any Exception class which is subclass of throwable bcz see logically there in main method we cant say it is aritmetic exception so as it is user defined so arithmeticexception must be extended with subclass of throwabel 
{
    ArithmeticException()
    {
        System.out.println("ur age is too young to get married");
    }   
}

class TooOld4 extends RuntimeException
{
    TooOld4()
    {
        System.out.println("ur are to old for marriage");
    }

}
public class exp2
{
    public static void main(String[] args) 
    {
    int age=17;
    if(age<18)
    {
        System.out.println("fcuk");
        throw new ArithmeticException();//what throw does is will intialize constuctor and raises exception of Type TooYoung
        /*
        how throws works:
          see in throw u need to pass an throwable obeject(throwable object in the sense which throws exception so as all the exception classes are of throwable type so here TooYoung extends RuntimeException so it is also a throwable object).
        see here we are calling constructor::
          the constructor is specified in the class TooYoung and it will be called
         */
    }
    else
    {
        throw new TooOld();
    }
}
}