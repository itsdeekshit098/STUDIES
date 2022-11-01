public class shortcircuitoperators {
    public static void main(String args[]) {
        int c = 0, d = 100, e = 50;// LINE A
        if (c == 1 && e < 100) {
            d = 150;
        }
        System.out.println("d = " + d);
        if (c < 1 || e < 100) {
            d = 150;
        }
        System.out.println("d = " + d);

    }

}
