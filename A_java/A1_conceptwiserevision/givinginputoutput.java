package conceptwiserevision;
import java.util.Scanner;

public class givinginputoutput 
{
public static void main(String[] args) 
{
   Scanner sc=new Scanner(System.in);
   //1)primary
    //11)numeric
      //111)integral
        //1111)integer
   int a=sc.nextInt();
   System.out.println(a);
   byte c=sc.nextByte();
   System.out.println(c);
   short s=sc.nextShort();
   System.out.println(s);
   long l=sc.nextLong();
   System.out.println(l);
        //112)floatingpoint
    float ff=sc.nextFloat();
    System.out.println(ff);
    double dd=sc.nextDouble();
    System.out.println(dd);
      //12)character
    char cc=sc.next().charAt(0);
    System.out.println(cc);
    //2)non primary
   String b=sc.next();
   System.out.println(b);
    //or
   String bb=sc.nextLine();
   System.out.println(bb);
}   
}
