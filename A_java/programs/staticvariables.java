//sir non-static variable cannot be referenced from a static context whereas static variable can be referenced from a non static context
//see static variable maintains only one copy means if create two objects sc1 and sc2 if assign 1 to a in sc1 and 2 to a in sc2 then the 1 of sc1.a is changed to 2 
//bcz if u declare a variable as static if u make use of obj to call it it does not makes a copy and store with some memory the native a's memory will be allocated with 
//new value here it is 1 changed to 2
public class staticvariables {
    int b;
    static int a;
    String name = "hansi";

    void nonstaticmethod1() {
        System.out.println("from non static method");
        System.out.println(b);
    }

    static void staticmethod() {
        System.out.println("static method");
        // System.out.println(a);
    }

    public static void main(String args[]) {
        staticvariables sc1 = new staticvariables();
        staticvariables sc2 = new staticvariables();
        sc1.b = 11;
        sc1.a = 1;
        sc1.nonstaticmethod1();
        System.out.println(a);
        sc2.a = 2;
        System.out.println(sc2.a);
        staticmethod();

    }

}
