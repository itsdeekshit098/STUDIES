//https://www.edureka.co/blog/tostring-in-java/#:~:text=The%20toString%20method%20is%20used,toString()%20method%20is%20called.
//public string tostring(){}

//getcalss()==prints like  (class Y) when sout(obj.getclass())
// getClass().getName()===prints pnly name of class without class word ( Y)

//abstract method declaration                 normal method declaration
//syntax: abstract returntype methodname();    returntype mname()
  //                                           {

//                                             } 


/*
 * Lab Exercise 2
Programs to implement different types of Inheritance. Implement the following:
a.	An abstract class "Shape" with the following properties: an instance variable shapeName of type String, an abstract method area (), a toString() method that returns the name of the shape.
b.	Create a subclass named "Sphere" which has radius and its area given by the formula 4*PI*r^2. 
c.	Create a subclass named "Rectangle" which has length and width and its area is length times width.
d.	Create a subclass named "Triangle" which has base and height and its area is ½*base*height. 
e.	Create another class which displays the calculated area. 

 */
import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
    final double PI = 3.14;
    int shapeName;

    abstract void area();

    public String toString()
     {
        return getClass().getName();
    }
}

class Sphere extends Shape {
    Scanner sc1 = new Scanner(System.in);
    double radius = sc1.nextDouble();

    void area() {
        System.out.println(4 * PI * (Math.pow(radius, 2)));
    }
}

class Rectangle extends Shape {
    Scanner sc2 = new Scanner(System.in);
    double length = sc2.nextDouble();
    double width = sc2.nextDouble();

    void area()
    {
        System.out.println(length * width);
    }
}

class Triangle extends Shape {
    Scanner sc3 = new Scanner(System.in);
    double base = sc3.nextDouble();
    double height = sc3.nextDouble();

    void area() {
        System.out.println(0.2 * base * height);
    }
}

class exp2 {
    public static void main(String args[]) {
        Sphere obj1 = new Sphere();
        Rectangle obj2 = new Rectangle();
        Triangle obj3 = new Triangle();
        obj1.area();
        System.out.println(obj1.getClass().getName());
        obj2.area();
        System.out.println(obj2.getClass().getName());
        obj3.area();
        System.out.println(obj2.getClass().getName());

    }

}