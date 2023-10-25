public class strongtypecasting {
    public static void main(String args[]) {
        byte a = 10; // range of byte is from -128 to 127
        switch (a) {
            case 1:
                System.out.println("1");
            case 10:
                System.out.println("10");
            case 250:
                System.out.println("250");
        }

    }

}

/*
 * here we got error bcz java supports strong type casting which means here x is
 * declared using byte but range of byte is from -128 to 127 but in switch we
 * used case 250 which is out of range of byte
 */
// String args[]