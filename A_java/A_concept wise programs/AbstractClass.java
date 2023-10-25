/*
 Abstract class:
    1)abstract class is a class which has unimplemented method in it we makes use of abstract class where we need to declare methods and implement them later by overriding or by someother means.even if a class has one unimplemented method it should be declared as abstract class
    2)the unimplemented method also should be declared as abstract.
    3)if u dont know the defination of method the end it with ; and start with abstract
Use of Abstract method in real lifeL
    1)see take the example of facebook when we upload a group photo it recomends us to tag the other person in default the person who is developing website might not be knowing the image recognition so he will leave the method as blank(i.,e the abstract)then the one who who knows the image recognition will implements it later.

 */
abstract class AbstractClass
{
    void hansi()
    {
        System.out.println("hansi");
    }
    abstract void m1();//unimplemented method
    

    
}

class hansi{
    void hansi()
    { 
                        //==>compiler thinks this kinds of methods as this is implentation of this method thats all but see w.r.t method that is commented
    }

     //void hansi1(); // ==>this is said to unimplemented method means abstract method so it should be
     //abstract void hasni1(); and also the class also should be of abstract type
    
}
 class Main{
    public static void main(String args[])
    {
        AbstractClass obj=new AbstractClass();//we can create the object of abstract class bcz abstract means it is not complete
    }

}