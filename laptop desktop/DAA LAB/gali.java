
import java.util.Scanner;

public class gali {
    public static void main(String args[]) {

        try {
            Scanner sc1 = new Scanner(System.in);
            int a, b;
            b = sc1.nextInt();
            a = sc1.nextInt();
            System.out.println(b / a);
        } catch (Exception e) {
            System.out.println("number is nor divisible by 0");
            int h;
            int r = 4;
            int y = 9;
            h = r + y;
            System.out.println(h);
        }
    }

}
