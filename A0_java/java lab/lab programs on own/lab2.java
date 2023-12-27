//https:www.edureka.co/blog/tostring-in-java/#:~:text=The%20toString%20method%20is%20used,toString()%20method%20is%20called.
import java.util.Scanner;
import java.lang.Math;
abstract class Shape
{
    double pi=3.14;
    String shapeName;
    abstract void area();//abstract method declaration                 normal method declaration
                        //syntax: abstract returntype methodname();    returntype mname()
  //                                                                   {

//                                                                     } 
    public String hasni()//toString is of object class which is parent class of all classes and it belongs to java.lang.String
    {                    // The toString method is used to return a string representation of an object.
        return getClass().getName();
    }
}

class Sphere extends Shape
{
    int y;
    Scanner sc=new Scanner(System.in);
    double radius=sc.nextInt();
    void area()
    {
        System.out.println("area of Sphere"+4*pi*(Math.pow(radius,2)));
    }
}

class Rectangle extends Shape
{
    Scanner sc=new Scanner(System.in);
    double length=sc.nextDouble();
    double width=sc.nextDouble();
    void area()
    {
        System.out.println("area of rectangle is "+(length*width));
    }

}

class Triangle extends Shape
{
    Scanner sc=new Scanner(System.in);
    double base=sc.nextDouble();
    double height=sc.nextDouble();
    void area()
    {
        System.out.println("area of triangle is"+(0.5*base*height));
    }
}

public class lab2
{
    public static void main(String args[])
    {
    Sphere sc=new Sphere();
    Rectangle sc1=new Rectangle();
    Triangle sc2=new Triangle();
    sc.area();
    System.out.println(sc.hasni());
    sc1.area();
    System.out.println(sc1.hasni());
    sc2.area();
    System.out.println(sc2.hasni());

    }
}