/*
 see in this program when compared to previous program exp4 what we done is we stopped abnormal termination of program by handling with try-catch but here output is blank no mssg is being dispalyed bcz here the constructor is intialized but but internally so mssg is not displayed and catch block of exception type is triggered as nothing is there nothing is printed or displayed.see if u want to show exception mssg or mssg instead of abnormal termination we uses to print something in catch block or if u want to print what u passed to constructor use obj.getmessage() (refer exp6.java)
 refer the photo of notepad in photos section for clarity
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
        try
        {
            throw new TooOld5("ur are to old for marriage");
        }
        catch(TooOld5 ex)
        {

        }
    }
}
}
