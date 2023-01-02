/*
 *what we need to show:
        1)outer and inner class have variable and method to call their opp class variabls and print the
        2)as inner class has access to fields(ex variabel )it can access even private variables also
        3)but outer class has no access soin method of outer class create an obj of inner class and acces the variable of inner class and print
 */
/*
 IMP:U MIGHT GET A DOUT LIKE WHY CANT I ACCES BOTH CLASSES FIELDS BY ONE OBJ THE REASON IS VERY SIMPLE NESTED CLASSES ARE DEVELEPOD TO MAKE OUTER CLASS FIELDS AVAILABLE TO INNER CLASS NOT LIKE BOTH CLASS ARE SAME
 */
class outer
{
    private int outervar=1;
    void outermethod()
    {
        inner obj=new inner();//bcz outermethod cannot access inner methods directly
        System.out.println(obj.innervar);
        System.out.println(obj.innervar+outervar);
    }
    class inner //innerclass will access all the outerclass fields including private
    {
        int innervar=9;
        void innermethod()
        {
            System.out.println(outervar);
            System.out.println(innervar+outervar);
        }
    }
} 

public class exp1ns {
    public static void main(String[] args) {
        outer obj2=new outer();
        obj2.outermethod();

        outer.inner obj3=obj2.new inner();
        obj3.innermethod();
    }
}
s