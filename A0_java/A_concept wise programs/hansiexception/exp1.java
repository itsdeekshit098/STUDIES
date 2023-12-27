//here we tried to throw an exception using throw and call constructor but there is abnormal termination.
class TooYoung extends RuntimeException
{
    TooYoung()
    {
        System.out.println("ur age is too young to get married");
    }   
}

class TooOld extends RuntimeException
{
    TooOld()
    {
        System.out.println("ur are to old for marriage");
    }

}
public class exp1
{
    public static void main(String[] args) 
    {
    int age=17;
    if(age<18)
    {
        System.out.println("fcuk");
        throw new TooYoung();//what throw does is will intialize constuctor and raises exception of Type TooYoung
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