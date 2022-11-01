//see here we intialiased i as 1 and condition is i<1 but i is == 1 eventhough cond is false statement got printed .this means statement got xecuted first then checked for condition

public class dowhileloop {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 1;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        } while (i < 1);
    }

}
