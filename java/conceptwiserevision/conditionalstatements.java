package conceptwiserevision;
import java.util.Scanner;
public class conditionalstatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //if-else-elseif
        int a=5;
        if (a>1 && a<6)
        {
            System.out.println("a is in b/w 1 and 6");
        }
        else if(a>1)
        {
            System.out.println("a is greater than 1");
        }
        else
        {
            System.out.println("not greater than 1 and a is not less than 6");
        }

        switch(a)
        {
            case 1:
            {
                System.out.println("hansi1");
            }
            case 2:
            {
                System.out.println("hansi2");
            }
            case 3:
            {
                System.out.println("hanis13");
            }
            case 4:
            {
                System.out.println("hansi14");
            }
        }

        //switch using char
        char c=sc.next().charAt(0);
        switch(c)
        {
            case 'a':
            {
                System.out.println("from a");
            }
            case 'b':
            {
                System.out.println("from b");
            }
            case 'c':
            {
                System.out.println("from c");
            }
        }
    }
}
