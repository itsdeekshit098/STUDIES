/*
 object:object is an instance(copy) of a class(by new sir object is a member function)
 */
//we will be having a dout why should we create objects eventhough the method or variables are in same class the reason is very simple as the main method is of static type so it cannot access non static methods so we cant call methods are objects with out creating objs.
    class objects
    {
        int a=100;
        static int x=200;//u will know why this if go through whole comments and program
        static void hansi()
            {
                int kk=20;
                //static int kk=20; is not possible bcz we should not use static in methods

            }
        
        public static void main(String args[])
        {
            System.out.println("hansi");
//decalring reference to a object we gonna create
             objects obj;
//intializing which values to be hold by refernce variabele
            obj =new objects();
            //or
            //objects obj =new objects();
//changing value of a variable of object created
            obj.a=10;
            System.out.println(obj.a);
            objects obj2 =new objects();
            System.out.println(obj2.a);
//if u looks at output obj2.a will be 100 whereas obj.a will be 10 bcz 
 //               see if u create a object it creates a separate memory and copies all the field(variables,methods,constructors )into it so we changed a value in obj by obj.a=10; it means value of a in obj created will be changed but the value of a in class remains same.
 //NOTE:  it means objects created will copy fields of its class
 //but in case of static variables it changes see below lines of code by declaring a static instance variable in instance part (NOTE:in instance part u need to declare and initialize in same line.u can declare  in one line and intialize in other line but  can do only anyone of it)
            
 //          in static variable case
 
            obj.x=300;
            System.out.println(obj.x);//it prints 300
            System.out.println(x); //it also prints 300
            //above outputs are same bcz see what happens when variable is declared as static is only one copy of variable is maintained what it means is that see here u created obj of class then if u change value of variable in obj it reflects in instatnce part too it means only one memory location will be there for static variable if u change the value the memory will be allocated with new variable.
            //NOTe:u cant access local variables methods using obj bcz their scope is only until that method

        }
    }

