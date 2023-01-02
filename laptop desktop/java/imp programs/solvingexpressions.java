//3.4x+50.2y=44.5  ==> ax+by=c 
//2.1x+0.55y=5.9   ==>  dx+ey=f

/*
              x                              y                              z
       _______________               _______________                 _________________
       50.2       44.5               3.4       44.5                   3.4         50.2
       0.55       5.9                2.1       5.9                    2.1         0.55

       (50.2*0.55)-(44.5*0.55)     (3.4*5.9)-(44.5*2.1)            (3.4*0.55)-(50.2*2.1)
       (b*e)-(c*e)                  (a*f)-(c*d)                    (a*e)-(b*d)

 */
import java.util.Scanner;

public class solvingexpressions {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        float a;
        a = sc1.nextFloat();
        float b = sc1.nextFloat(); // ax+by=c
        float c = sc1.nextFloat(); // dx+ey=f
        float d = sc1.nextFloat(); // if we write in above format then it becomes
        float e = sc1.nextFloat();
        float f = sc1.nextFloat();
        double g = ((b * e) - (c * e)) / ((a * e) - (b * d));  
        double h = ((a * f) - (c * d)) / ((a * e) - (b * d));
        System.out.println(b*e);
        System.out.println(g);
        System.out.println(h);

    }
}