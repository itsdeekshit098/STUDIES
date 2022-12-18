import java.util.Scanner;

public class switch1 {
   public static void main(String args[]) {
      System.out.println("a:hi b:bye c:tata");
      Scanner sc = new Scanner(System.in);
      char a = sc.next().charAt(0);
      switch (a) 
      {
         case 'a':
         {
            System.out.println("hi");
            break;
         }
            
         case 'b':
         {
            System.out.println("bye");
            break;
         } 
         case 'c':
         {
            System.out.println("tata");
            break;
         }
         default:
         {
            System.out.println("u entered invalid value");
            break;
         }

      }
   }
}

