public class static_variable 
{
    static int j=1;
    int x=6;
    public static void main(String[] args) 
    {
        System.out.println("value of j in instance part of the code"+j);
        int j=66;
        System.out.println(j); //
        System.out.println(j);//value of static variable in instance part
        static_variable obj=new static_variable();
        System.out.println(obj.j);//prints the value of obj.j which is instance of varible j of static_variable class
        obj.j=24;                 //changing the value of instance of j(object of j) not j
        System.out.println(j);   //printing j not instance of j we will get the assigned value to obj.j
        System.out.println("let us run the nonstaticvariable method");
        System.out.println("value of instance variable x:"+obj.x);
        nonstaticvariable();
        System.out.println("value of x after after modification of value of obj2.x"+obj.x);//value of x in instance part is  not modified when we modify its object value in another method  
        System.out.println("value of j after after modification of value of obj2.x"+obj.j);//value of j in instance part is  modified when we modify its object value in another method  
        //this is what the diff b/w static and non static instance variable
    }

    public static void  nonstaticvariable()
    {
        static_variable obj2=new static_variable();
        System.out.println("value of instance of the variable x"+obj2.x);
        obj2.x=55;
        obj2.j=89;
        System.out.println("value of obj.x after modification of value of obj.x"+obj2.x);
    }
}

/*summary
 1)we got output as 24 which means assigned value to obj.j(instance(copy or object) of a variable) 
 2)which means the value of static variable in the instance of the class is changed when we changed the value of instance of the variable of class static_variable
 3)this means that the static variable instance can be created but  at the same memory location of the static variable
 4)if we do the above task with non static variable then the case will be different
 */

 /*why varibles inside the method cannot be static??
ans:
    1)w.k.t the scope the scope of the local varibles is upto that method itself
    2)but when a varible is declared as static then  variables are associated with the class itself, not with specific instances or methods(proof for this point refer ex1 below) and as it belongs to class then static variable belong to all the methods of the class .
    3)but if we look at local variable its scope it upto the method itself it cannot be accessed outside the method 
    4)so using static on local variable leads to contradiction of the statement "static variable belongs to every method of the class as it is associated with class not instance of class ".so we cannot make varibles inside the method static.
    
    ex:1
    class hansi
    {
        int k=1;
        psvm(String[] args)
        {
           hansi obj=new hansi();
           sout(k)      //1
           sout(obj.k) //1
           obj.k=56
           sout(k)      //56
           sout(obj.k)  //56
            
        }
    }

    
  */