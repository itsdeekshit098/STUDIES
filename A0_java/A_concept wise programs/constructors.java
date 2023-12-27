/*
constructor:
          constructor is used used to execute set of instructions
          constructor will be executed when obj o f that class is created proof for that in ConstructorProof.java 
 constructor:
    1)see we use constructor instead of method when we have a scenario like want to create n no of objects of that method  and intialize or give values to the fields or variables of that method
    everytime 1)creating a object
              2)intializing value or changing value  will too difficult or boring there constructor comes into picture 
    2)see if u create or define a constructor(see below) once then the constructor is automatically and immediatly called when obj is created u need not to call constructor explicitly

    3)constructor will not have any return type even void if it has return type no dout it is a method

    4)if the constructor has parameters u can give values while creating object itself(refer to program once)

    5)the constructors can  only have public, protected & private are permitted even static is not permitted

    diff b/w method and constructor:
    1)obj should be explicitly called but constructor are called immediately when obj is created
    2)in constructor values for constructor parameters are given while creating obj itself (logically as class name and constructor name will be same u can give there itself) but in case of method 
    2)obj should have the return type like int,void,String but constructors not
 */
public class constructors {
    //non parameterized constructor
    constructors(){
        System.out.println("from non parameterized constructor");
    }
    public static void main(String args[])
    {
        constructors obj;//declaring an obj 
        System.out.println("hansi");
        obj=new constructors();//initialiazing an object
        //or
        //constructors obj=new constructors();
        constructors obj1=new constructors();
        constructors obj3=new constructors();
        //like this u can create n no of objects and call see parameterized_constructors program once u will get clarity

    }
}
