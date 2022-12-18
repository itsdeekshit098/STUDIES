/*
 widening type conversion:(implicitly done ,no memory loss)
    byte->short->char->int->long->float->double
narrowing type conversion:(explicitly need to done,loss of memory takes place bcz big value  is inserted to small value)
    double->float->long->int->char->short->byte
 */
public class typecasting {
    
    public static void main(String[] args) {
        char a='k';
        double h=a;
        System.out.println(h);
        //narrowing 
        double d=1.123456789d;
        long i=(long)d;
        System.out.println("long value of double value==> "+i);
        char c=(char)i;
        System.out.println("cahr valur of long from double==> "+c);


    }
}