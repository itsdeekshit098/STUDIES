final class practice1 {

    void a() {
        final int a;
        a = 10;
        int b = 20;
        final int c;
        c = a * b;
        System.out.println(c);
    }
}

class practice {
    public static void main(String args[]) {
        practice1 obj = new practice1();
        obj.a();
    }
}
