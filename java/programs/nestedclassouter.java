
class nestedclassouter {
    int x = 1;
    int y = 2;

    class innerclass {
        int z = 6;

        void s1() {
            System.out.println("mssg from inner class");
        }
    }

    public static void main(String args[]) {
        nestedclassouter outobj = new nestedclassouter();
        nestedclassouter.innerclass inobj = outobj.new innerclass();
        // new
        inobj.s1();
        System.out.println(inobj.z);

        System.out.println(outobj.x);;
    }

}
