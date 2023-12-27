public class staticvar 
{
    static int x=12;
    public static void main(String[] args) {
        staticvar obj=new staticvar();
        obj.x=50;
        System.out.println(obj.x);
        System.out.println(x);
        /* here see the obj.x and x prints the same value
         bcz
            1)first thing here normally object creates new instance of class but here as x is a static variable eventhoug new instance ante obj is created there wont be new allocation of memomory for x as it is static so the obj.x will be pointing to same memory location.x is maintained as only one copy that is why if u change the value by using obj.x the value of x is also changed
         */
    }
}
