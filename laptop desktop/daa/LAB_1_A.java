
//how can we store the details of each student in different variables other than switch and assigning to on variable 
import java.util.Scanner;

class LAB_1_A {
    public static void students(int n) {
        int i;
        String USN, Name, Branch, Phone_no;
        Scanner sc1 = new Scanner(System.in);
        for (i = 0; i < n; i++) {
            System.out.println("enter the name of the student");
            Name = sc1.nextLine();
            System.out.println("usn");
            USN = sc1.nextLine();
            System.out.println("Branch");
            Branch = sc1.nextLine();
            System.out.println("phone no");
            Phone_no = sc1.nextLine();
            String aaar = (USN + " " + Name + " " + Branch + " " + Phone_no);
            System.out.println(aaar);

        }

    }

    public static void main(String args[]) {
        System.out.println("enter the no of students details u want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        students(n);
    }

}