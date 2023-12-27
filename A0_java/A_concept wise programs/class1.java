/*
class
1)A class is a user defined blueprint or prototype from which objects are created. 
or
Class is a template, blue print or contract that defines what an object field and method will be

class classname
	{	type instance-variable1;
		type instance-variable2;
		……….
		……….
		type methodname1(parameter list)
		{
			……// body of method			 
		}
		type methodnameN(parameter list)
		{
			……// body of method			 
		}	
    }
2)The data or variables defined within a class are called instance variables.
3)The code is contained within the methods.
4)The methods and variables defined within a class are called members of class.
5)note :
    if u declare any instance variable in a class without initializing then no memory is created or allocated for that instance variable.memory will be initialized only when obj is created are initialized there itself




 */

 class class1{
	int x=10; //iNATnce variable :scaope of this will be until end of class
	int y;            //memory wont be allocated for this bcz only declared
	                                           //in this instance part(i.e in class outside of methods) u can only intialize or declare variables or crate constructors or methods 
//static instance variable
	static int i=100;
	
	
//non static method										   
	void hansi() 
	{
		int k=45;  //local variable(declared with in a method or constructor) scope will be in declared method or constructor only
		System.out.println("from non static method");
		System.out.println(k);//u can call k here inside this method but u cant call outside of this method check by removing comments once in below method
	}
	void kkr()
	{
	//System.out.println(k);
	}
	

//static method
static void hansi1()
{
	System.out.println("from static method");

}


//constructoe=r(note constructor name should be same as class name)
    class1() 
	{
		System.out.println("from constructor");
	}

//main method
//:see compiler loads static contents first and then goes to main method and loads the contents in main method like see here below u called method hansi it loded and whatever statements in it are executed.static fields are loaded during class load event itself
	public static void main(String args[])  
	{
		//System.out.println(x);
		//see if used to call x as in below line by using static it shows error like cannot acces non static content in a static method
		
//calling or loading non static method
		//hansi(); u cant call non static method directly in static static main method if u want to call make method hansi as static or else create a object of clss and call through that
		class1 obj1=new class1();
		obj1.hansi();
//calling static method
		hansi1();//no need of creating object
//calling non static variable
	    System.out.println(obj1.x);

//calling static variable
		System.out.println(i);
	
//calling constructor
		//class1(); u cant call constructor directlu bcz constructor is created or intialized or loaded only when object is created as below it means constructor is called when object is created
		class1 obj=new class1(); 


	}
 }