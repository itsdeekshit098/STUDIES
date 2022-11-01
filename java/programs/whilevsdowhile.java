/*In this program while using while it executes only when block of code satisfies but in do while block of code do executes and then checks for condition in while loop */

public class whilevsdowhile {
    public static void while1() {
        System.out.println("while");
        int i = 0;
        while (i < 0) {
            System.out.println(i);
            i++;
        }
    }

    public static void dowhile1() {
        System.out.println("dowhile");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 0);
    }

    public static void main(String args[]) {
        while1();
        dowhile1();
    }

}
