public class nestedifimp {
    public static void main(String[] args) {
        String address = "Delhi, India";

        if (address.endsWith("India")) {
            if (address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            } else if (address.contains("Noida")) {
                System.out.println("Your city is Noida");
            } else {
                System.out.println(address.split(",")[1]);//split spilts at mentioned char here delhi,india are separated by , and indexed in index order as 0=delhi and 1=india
            }
        } else {
            System.out.println("You are not living in India");
        }
    }
}
