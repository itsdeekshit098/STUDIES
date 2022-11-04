/*

1)The static can be used on
		
		-- Variable (Class variables)
		-- Method (Class method)
		-- Block
        --class	 
        NOTE:fields or members of method cannot be declared as staitic
2)if u declare something as static u can call that without creating a object so:
                                The static keyword belongs to the class than instance of the class
3)w.r.t to compiler the compiler scan for static fields first before going to main method.the static fields are loaded during class load event 

4)if something is declared as static then only one copy of it is mainted see for ex:
    static int x=20;
    main method()
    {
        clssname obj=new clssname();
        obj.x=40;
        sout(obj.x);
        sout(x);
    }
    output;
    40
    40
       1)first thing if u create obj of class it doesnt copies the static fields and keeps that copies in obj created.the obj will be having access to manipulate the static fields not to clone and keep in objs.
       2)see in above ex x is static with value 20 AND WITH some xxx memory location is allocated to it 
       and then object of class is created and obj.x is changed to 40 it doesnt mean other 20 copied to   obj.x with other xxx memory location and changed 20 to 40.it means value at xxx loacation is changed to 40 
       3) hence this proves that only one copy of static fields are maintained
5)The static keyword is used mainly for memory management.(above one is example for that)

STATIC METHODS:
    A static method can be invoked(called or executed) without the need for creating an instance of 
	   a class.
       refer static_method program once


STATIC BLOCK:
    *It is used to initialize the static data member
	
	* It is executed before main method at the time of class loading.
    refer static_block program once


 */
class static_keyword
{
    static int x=10;
    public static void main(String args[])
    {
        static_keyword obj=new static_keyword();
        System.out.println("value of x before manupulating = "+x);
        obj.x=11;
        System.out.println("value of obj.x= "+x);
        System.out.println("value of x after manupulating in obj= "+x);
        static_keyword obj1=new static_keyword();
        obj1.x=12;
        System.out.println("value of obj1.x= "+x);
        System.out.println("value of x after manupulating in obj1= "+x);
    }

}