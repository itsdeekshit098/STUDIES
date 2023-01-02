public class ConstructorOverloading 
{

    ConstructorOverloading()
    {
        System.out.println("from no-arguments constructor or un parameterized constructor");
    }
    ConstructorOverloading(int k)
    {
        System.out.println("from parameterized constructor");
        System.out.println("the value u given is "+k);
    }
    public static void main(String[] args) 
    {
        new ConstructorOverloading();
        new ConstructorOverloading(8);//what happens here is by practice(8) 8 is assigned to respective members of that constructor and it will be like just assigned will in logical exostence wont be in physical existence what new does is it creates the physical existence of the practice(8) construtor.and w.r.t constructors no need to explicitly call the physical exstence once physical existence is created the constructor will be called    
        //see we can assign this constuctor  to class type variable
        ConstructorOverloading obj=new ConstructorOverloading();
        ConstructorOverloading obj1=new ConstructorOverloading(9);
    }
}
