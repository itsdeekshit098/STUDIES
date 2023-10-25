import java.util.Scanner;

public class nestswitch {
    public static void hansi(int a) {
        Scanner myobj1 = new Scanner(System.in);
        switch (a) {
            case 1: {
                System.out.println("enter ur roll no ");
                int b = myobj1.nextInt();
                switch (b) {
                    case 1: {
                        System.out.println(" hi deekshith u got 70 marks");
                        break;
                    }
                    case 2: {
                        System.out.println("hi chinnu u got in by 90 marks");
                        break;
                    }
                    case 3: {
                        System.out.println("hi chinni u got in bu 56 marks");
                        break;
                    }
                }
                break;

            }
            case 2: {
                System.out.println("enter ur roll no ");
                int b = myobj1.nextInt();
                switch (b) {
                    case 1: {
                        System.out.println(" hi deekshith2 u got 70 marks");
                        break;
                    }
                    case 2: {
                        System.out.println("hi chinnu2 u got in by 90 marks");
                        break;
                    }
                    case 3: {
                        System.out.println("hi chinni2 u got in bu 56 marks");
                        break;
                        // how to goto switch of a again
                    }
                }
            }
            default: {
                System.out.println("please enter valid class name they are 1 and 2");

                break;

            }

        }

    }

    public static void main(String args[]) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter ur class");
        int a = myobj.nextInt();
        hansi(a);

    }

}
