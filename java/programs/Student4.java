//https://www.javatpoint.com/java-constructor
class Student4 {
    int id;
    String name;

    Student4(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(i + " " + name);
    }

    public static void main(String args[]) {

        Student4 s1 = new Student4();

        s1.display(11, "hansi");

    }
}