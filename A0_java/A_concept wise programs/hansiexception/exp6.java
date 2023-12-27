class TooYoung6 extends RuntimeException
{
    TooYoung6(String s)
    {
        super(s);
    }   
}

class TooOld6 extends RuntimeException
{
    TooOld6(String s)
    {
        System.out.println(s);
    }

}
public class exp6
{
    public static void main(String[] args) 
    {
    int age=17;
    if(age<18)
    {
        try
        {
            throw new TooYoung6("ur age is too young to get married");
        }
        catch(TooYoung6 ex)//see in above throw statement an exception of TooYoung is raised so an object of type TooYoung is created which tiggers the catch block having TooYoung so we mention exception class as Tooyoung
        {
            System.out.println("printing mssg as our wish in catch block");
            //or
            System.out.println(ex.getMessage());//it displays mssg u passed in constructor
        }
    }
        
    else
    {
        try
        {
            throw new TooOld5("ur are to old for marriage");
        }
        catch(TooOld5 ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
}
