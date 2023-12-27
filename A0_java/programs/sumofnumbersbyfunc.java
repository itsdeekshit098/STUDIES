public class sumofnumbersbyfunc {
    static void mymethod(int a, int b) {
        int c;
        c = a + b;
        System.out.println("sum of two numbers is : " + c);
        /*
         * QUESTION: return c; c is calc in method only and i am printing it in mymethod
         * only then whats need to use return? if not using it is showing error??
         * ANS=
         * "as previously we declared method(means function) like ( static int mymethod(int a,intb)) as u need to return something to the method. if u use void u need not to return any value to the method(function in java)"
         */
    }

    public static void main(String args[]) {
        mymethod(1, 2);
    }

}
