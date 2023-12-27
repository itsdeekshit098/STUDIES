package conceptwiserevision;

public class typecasting1 
{
    public static void main(String[] args) 
    {
        //widening
        byte b=1;
        System.out.println(b);
        short s=b;    
        System.out.println("short= "+s);
        //char c=b;//note cannot convert from short to char or byte to char
        double d=s;
        System.out.println("double= "+s);

        //narrowing
        //let us conver double to short
        double dx=66.55d;
        System.out.println("double= "+dx);

        short sx=(short)dx;
        System.out.println("short from double= "+sx); 

        char u=(char)dx;
        System.out.println(u);


    }
}
/*
 summary:
        1)typecasting 
            1)widening tc or implicit conversion(smaller to bigger)
            2)narrowing tc or explicit conversion(bigger to higher) syntax sdt var=(sdt) bdtvar where sdt=smallerdatatype,bdt=biggerdatatype
            order
            widening:
                byte=>short=>char=>int=>long=>float=>double
            narrowing:
                double=>float=>long=>int=>char=>short=>byte
        2)u cannot convert short to char or byte to char in normal fashion



        explanation:
        In Java, a short is a 16-bit signed integer data type, while a char is a 16-bit Unicode character data type. To convert a short value to a char value in Java, you can simply cast the short value to a char value using the (char) operator.
        short x=65;
        char y=(char) x;//like how in narrowing type casting
        similary in case of byte
        In Java, a byte is an 8-bit signed integer data type, while a char is a 16-bit Unicode character data type. To convert a byte value to a char value in Java, you can first cast the byte value to an int value using the (int) operator, and then cast the resulting int value to a char value using the (char) operator.
        byte b = 65; // a byte value representing the ASCII code for character 'A'
        int i = (int) b; // convert the byte value to an int value
        char c = (char) i; // convert the int value to a char value
        System.out.println("The char value is: " + c); // prints "The char value is: A"

 */