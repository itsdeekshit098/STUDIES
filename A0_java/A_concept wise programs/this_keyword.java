/*
 this keyword
    *we use super to specifiacally access the parent class members and we use this to specifically access child members.
    1)this keyword is mainly used to do something w.r.t to instace fields mainly instance variable
     u can use this to call  1)variables
                             2)methods
                             3)constructors
    1)variables
 */
public class this_keyword {
    int a=1;
    //instance variable role
    void hasni1()
    {
        int a=70;
        System.out.println(this.a);//prints 1 as value of a is 1 in instance part
        System.out.println(a);
        this.a=30;//changes value of a in instace part(in class outside of methods is refered as instance part)
        System.out.println(this.a);
        System.out.println(a);
    }

    //using this to call cnstructor
    this_keyword()
    {
        System.out.println("from constructor");
    }
   
    this_keyword(int i)
    {
        this();//w.r.t 

    }
    //using this to call method
    class inner
    {
        void hasni()
    {
        System.out.println("from method");
    }
    void callhansi()
    {
        this.hasni();
    }
    }
    

    public static void main(String args[])
    {
        this_keyword obj=new this_keyword(1);

        
    }

}
