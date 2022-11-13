/*
 arrays:
   2 types of declaration or intialization
          1)type arrayname=new type[sizeofarray];
          2)array with known value
        type arrayname[]={value1,value2,.....,valuen};
 */
import java.util.*;

public class arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // array declaration: if u decalre a array memory wont be allacated means arrays
        // just exists logically if u need array to be existed physically u need to use
        // new
        // keyword .
        int hansi[];
        // array intialization or in other words making array to be existed physically
        hansi = new int[100];
        // another way of declaring a array in one line
        // int hansi[]=new int[100];
        int i;
        for (i = 0; i < x; i++) {
            System.out.println("enter the element to be inserted at+ " + i);
            hansi[i] = sc.nextInt();
        }
        for (i = 0; i < x; i++)
            System.out.println("a[" + i + "]=" + hansi[i]);

    }
}
