/*
 output is 
        Parent Class
        Child Class
            bcz see whenever class child obj is created in psvm then the constructor in child class is executed as by default there will be a super() so constructor of immediate parent class is also executed 
 */
class parent extends hansi
{
    parent(){
        System.out.println("Parent Class");
    }
}
class child extends parent{
    child()
    {
        System.out.println("Child Class");
    }
}
class Constructor {

public static void main(String[] args) {
       child ch= new child();
    }  }

