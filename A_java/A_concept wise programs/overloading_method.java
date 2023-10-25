/*
 method overloading:
    1)method overloading in the sense methods will have same name but will be having different no of prameters.
    2)u will be having a dout of which method will be called when see while u call a method u will call with by passing x no of arguments so then the method which is matching with the no of arguments u passed will be called first."(see the example below)"
    3)the same thing applys to constructor overloading

 */

public class overloading_method {
    void hansi(int x,int y)
    {
        int z=x+y;
        System.out.println("sum of two numbers is "+z);
    }
    void hansi(int x,int y,int k)//no problem if u use same variable also bcz both method cannot be called with one statement they need to be called explicitly different no of arguments 
        //and main thing is scope of the pararmeters will be until this method only
    {
        int z =x+y+k;//see here we are using z again bcz the scope z in previous method will be upto that method itself so the value of that z wont be carried upto this z so we can use z again here
        System.out.println("sum of three numbers is "+z);

    }
    public static void main(String args[])
    {
        overloading_method obj =new overloading_method();
        obj.hansi(1,2,3);
        obj.hansi(1,2);
        //obj.hansi(); //will show error bcz compiler checks for method hansi with no parameters as it dint find so it shows error of not found method with no arguments in overloading_method
    }
    
}
