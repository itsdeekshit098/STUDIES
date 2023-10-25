import java.util.Scanner;

public class switch1 {
   public static void main(String args[]) {
      System.out.println("1:hi 2:bye 3:tata");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      switch (a) {
         case 1:
            System.out.println("hi");
            break;
         case 2:
            System.out.println("bye");
            break;
         case 3:
            System.out.println("tata");
            break;
      }
   }
}
