/*
 EXCEPTION HANDLING 
    1)what happens w.r.t exception handling is see in below programoutside try block  1/0  which cant be done so jvm shows an error saying that Exception in thread "main" java.lang.ArithmeticException: / by zero.then what happens  when control comes to that line is then w.r.t that statement an object is generated of that exception class and that object triggers that excpetion mssg if it is an exception.
    2)so here as it is 1/0 so obj of arithmetic exception is created and that triggers the mssg from that exception class 

    3)when we use try catch what happens is  see if u include 1/0 in try then what happens is when error is raised then an object is created of that exception class(here an obj of arithmetic exception is created)  so then the control serches for catch block with the exception class of obj created(catch block with aritmetic exception) as there is catch block with arithmetic exception here so the exception is being handled.if there is no catch block with that exception then jvm print error mssg by triggering the exceptionclass directly on its own(try by changing arithmetic ot array index out of bounds if u want to see)

    4)matter of exception classes subclasses need to be included
    
 */
class EH1
{
    public static void main(String[] args) 
    {
        System.out.println(1/0);//it shows exception 
        try
        {
            System.out.println(1/0);//AS THIS exception is in try block so this will be handled by catch block with the exception class of this type
            System.out.println("kkr");
        }
        catch(ArithmeticException e)
        {
            System.out.println("division cannot be done by zero");
        }
       System.out.println(1/0);//it shows exception 
        
    }
    
}
