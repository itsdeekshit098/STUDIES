/*this to invoke current class constructor */
public class thistoinvokecurrentclassconstructor 
{
    thistoinvokecurrentclassconstructor()
    {
        System.out.println("from constructor");
    }  
    thistoinvokecurrentclassconstructor(int a)
    {
        //System.out.println();
        this();//note calling class using this should be the first line of code in constructor
        System.out.println("executed from parameterized constructor");
    }
    public static void main(String[] args) {
        thistoinvokecurrentclassconstructor ob=new thistoinvokecurrentclassconstructor(1);
    }
}
