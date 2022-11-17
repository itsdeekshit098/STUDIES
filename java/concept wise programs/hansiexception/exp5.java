/*
 see in this program when compared to previous program exp4
 */
class TooYoung5 extends RuntimeException
{
    TooYoung5(String s)
    {
        super(s);
    }   
}

class TooOld5 extends RuntimeException
{
    TooOld5(String s)
    {
        System.out.println(s);
    }

}
public class exp5
{
    public static void main(String[] args) 
    {
    int age=17;
    if(age<18)
    {
        try
        {
            throw new TooYoung5("ur age is too young to get married");
        }
        catch(TooYoung5 ex)//see in above throw statement an exception of TooYoung is raised so an object of type TooYoung is created which tiggers the catch block having TooYoung so we mention exception class as Tooyoung
        {

        }
    }
        
    else
    {
        throw new TooOld5("ur are to old for marriage");
    }
}
}
