import java.util.Scanner;

public class userinput {
    public static void main(String args[]) {
        Scanner scobj = new Scanner(System.in);
        System.out.println("enter ur first number");
        int a = scobj.nextInt();
        System.out.println("enter 2nd number");
        int b = scobj.nextInt();
        int c = a + b;
        System.out.println("enter ur name");
        String name = scobj.nextLine();
        System.out.println("enter first letter in ur name");
        char fl = name.charAt(0);
        System.out.println(
                " my name is : " + name + " first character in it is :" + fl + " and sum of two numbers is : ");
    }
}