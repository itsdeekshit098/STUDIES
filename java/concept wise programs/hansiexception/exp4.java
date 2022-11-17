/*here in this program we are  passing arguments in the consttuctor used in throw and in that constructer we are calling constructor of immidiate parent class of TooYoung which is exception here using super (super()==>calls constructor).here we are doing something like super(s) calling constructor immediate parent by passing a string.what happens in that parent class(RuntimeException) constructor there will be super by default in that constructor so  as we pass s it passes s to the immediate parent class of that class which will be exception class then again in the Exception class constructor there will be super() which becomes super(s) and passes s to itsparent class which is Throwable in this class what happens is the constructor of Throwable contains a method printstacktrace()==>which prints the string which we passed as code becomes like printstacktrace(s) */
/*output:
 the input we passed is printed as description for exception but the abnormal termination remains same let us remove that abnormal termination by handing it with try and catch(refer exp5 )
refer the photo of notepad in photos section for clarity 
*/
class TooYoung4 extends RuntimeException
{
    TooYoung4(String s)
    {
        super(s);
    }   
}


class TooOld4 extends RuntimeException
{
    TooOld4(String s)
    {
        System.out.println(s);
    }

}
public class exp4
{
    public static void main(String[] args) 
    {
    int age=17;
    if(age<18)
    {
        throw new TooYoung4("ur age is too young to get married");
    }
    else
    {
        throw new TooOld4("ur are to old for marriage");
    }
}
}