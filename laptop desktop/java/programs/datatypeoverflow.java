//here in line 8 what hapens is first in rh side a is converted to byte and then assigned to b variable of type byte
//as byte range is -127 to 128 but here a is 130 so it leads to overflow
public class datatypeoverflow {

    public static void main(String[] args) {
        // Overflow
        int a = 130;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);
    }

}
