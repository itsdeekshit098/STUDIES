public class nestedlooping1 {
    public static void main(String args[]) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.println("hi : " + i);
                }
            }

        }

    }
}
