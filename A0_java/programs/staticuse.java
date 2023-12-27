//see here both instance variables and methods are declared as static 
//see if we need to call hasni method in main method without creating objects we need to declare hasni method as static and as hasni method need to acces variables a and be
//also need to be declared as static
class staticuse {
    static int a = 10;
    static int b = 20;

    static void hasni() {
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        hasni();

    }
}