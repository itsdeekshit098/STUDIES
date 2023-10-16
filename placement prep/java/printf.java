
import java.util.*;
public class printf {
    public static void main(String[] args) 
    {
        int a=123456;
        float f=1.33333f;
        String s="hasni";
        System.out.printf("%09d%n",a);
        System.out.printf("%19d%n",a); //left side tp integer spaced by 19 spaces
        System.out.printf("%-19d%n",a);//right side to integer  spaced by 19 spaces

        System.out.printf("%.2f",f);//2 decimals after .
        System.out.printf("%10.2f",f);//left side spaced and 2 decimals after .
        System.out.println();
        System.out.printf("%-10.2f",f);//right side spaced and 2 decimals after .
        System.out.println();

        System.out.printf("%s",s); 
        System.out.println();
        System.out.printf("%15s",s);//left side to word 15char length spaced
        System.out.println();
        System.out.printf("%-15s",s);//right side to word 15char length spaced
        System.out.println();


    }
}
