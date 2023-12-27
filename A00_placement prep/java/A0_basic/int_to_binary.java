public class int_to_binary {
    public static void main(String[] args) {
        
                // code here
                Long X=24L;
                String y=Long.toBinaryString(X);
                System.out.println(y);
                y=String.format("%32s",y).replace(' ','0');
                System.out.println(y);
                long z=Long.parseLong(y,2);
                System.out.println(z);
            }
  

}
