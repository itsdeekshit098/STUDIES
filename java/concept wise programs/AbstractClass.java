/*
 Abstract class:
    1)abstract class is a class which has unimplemented method in it we makes use of abstract class where we need to declare methods and implement them later by overriding or by someother means.even if a class has one unimplemented method it should be declared as abstract class
    2)the unimplemented method also should be declared as abstract.

 */
abstract class AbstractClass
{
    abstract void m1();
    

    
}

class hansi{
    void hansi()
    { 
                        //==>compiler thinks this kinds of methods as this is implentation of this method thats all but see w.r.t method that is commented
    }

     //void hansi1(); // ==>this is said to unimplemented method means abstract method so it should be
     //abstract void hasni1(); and also the class also should be of abstract type
    
}