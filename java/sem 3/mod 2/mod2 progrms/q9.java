import java.lang.Math;
//import java.util.Scanner;

class shape
{
    double dimension;
    shape()
    {
        
    }
    shape(double dm)
    {
        this.dimension=dm;
        System.out.println(this.dimension);
    }
    void m22()
    {
        System.out.println(dimension);
    }
    
}
class circle extends shape
{
    void area()
    {
        System.out.println(dimension);
        System.out.println("area of circle"+(3.14*Math.pow(this.dimension,2)));
    }
    void circumference()
    {
        System.out.println("circumference of circle"+(2*3.14*this.dimension));
    }
}

class square extends shape
{
    void area()
    {
        System.out.println("area of square"+(Math.pow(dimension,2)));
    }
    void diagnol()
    {
        System.out.println("diagnol of square"+Math.sqrt(2)*dimension);
    }
}

class sphere extends shape
{
    void volume()
    {
        System.out.println("volume of sphere"+((4/3)*3.14*Math.pow(dimension,3)));
    }
    void surfacearea()
    {
        System.out.println("surface area of sphere"+(4*3.14*Math.pow(dimension,2)));
    }
}
public class q9 
{
    public static void main(String[] args) 
    {
        shape obj0=new shape(4);
        obj0.m22();
        //Scanner sc=new Scanner(System.in);
        circle obj=new circle();
        square obj1=new square(); 
        sphere obj2=new sphere();
        
        obj.area();
        obj.circumference();

        obj1.area();
        obj1.diagnol();

        obj2.volume();
        obj2.surfacearea();
    }
}

