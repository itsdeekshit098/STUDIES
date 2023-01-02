class nestedclassouter1stmethod {
    int x = 1;
    int y = 2;

    class innerclass {
        int z = 6;

        void s1() {
            System.out.println("mssg from inner class");
        }
    }

    public static void main(String args[]) {
        // second way of contructing innerclass fields
        outerclass.innerclass inobj = new outerclass().new innerclass();
        inobj.s1();
    }
}
