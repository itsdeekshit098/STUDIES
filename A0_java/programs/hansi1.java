class university {
    int usn;
    String name;

    university(int a, String b) {
        usn = a;
        name = b;
        System.out.println(a + "  " + b);
    }

}

class hansi1 {
    public static void main(String args[]) {
        university obj = new university(1, "kkr");
    }
}
