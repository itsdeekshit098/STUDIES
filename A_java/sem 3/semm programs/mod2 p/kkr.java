/*
 output is 
        hansi
        Parent Class
        Child Class
            bcz see whenever class child obj is created in psvm then the constructor in child class is executed as by default there will be a super() so constructor of immediate parent class is also executed .
 */
class hansi1234{
    hansi1234()
    {
        System.out.println("hasni");        
    }
}
 class parent1 extends hansi1234
{
    parent1(){
        System.out.println("Parent Class");
    }
}
class child1 extends parent1{
    child1()
    {
        System.out.println("Child Class");
    }
}
class kkr {

public static void main(String[] args) {
       child1 ch1= new child1();
    }  }


