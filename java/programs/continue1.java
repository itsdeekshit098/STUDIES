/*in this program continue is used to skip printing 4 and if we look at scope of printing i when i=4 it prints before continue after continue it wont print i*/

public class continue1 {
    public static void main(String args[]) {
        int i;
        int n = 10;
        for (i = 0; i < n; i++) {
            System.out.println("before continue: " + i);
            if (i == 4) {
                continue;
            } else if (i == 6) {
                System.out.println("i am breaking");
                break;
            }
            System.out.println("after conntinue: " + i);

        }
    }

}
