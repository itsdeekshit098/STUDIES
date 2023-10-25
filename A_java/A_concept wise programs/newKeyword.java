
/*in this program
       1)new kwywoed
       2)inputting data into class members via objects
*/
import java.util.Scanner;

class university {
    int a = 100;
    String hansi;
    void hasni1()
    {
        System.out.println("friom method");
    }
}

class newKeyword {
    public static void main(String args[]) { // use of new keyword
        university obj = new university(); // new keyword helps us to convert logical existence of university class
                                           // members into physical existence.in clear univeristy() constructor willl be having all the things of unversity class bcz if unparameterized constructor is not defined explicitly then there will be constructor which will have all fieds of class in ligical existence.to make that into physical existence we use new keyword.
        Scanner sc = new Scanner(System.in); // here new keyword creates physical existence of scanner class
        System.out.println("enter the usn");
        obj.a = sc.nextInt();
        obj.hansi = "kkr";
        System.out.println(obj.a);
        //
        new university();//it also creates physical existence(obj)  but will not be assigned to any variable
        new university().hasni1();//we can call the method directly like this  also
        //new university().System.out.println(a); //we cant do these kind of stuff like calling variable so we used to assign the created one to a variable
    }
}