public class A1_for_each_in_array
{
    public static void main(String[] args) {
 
            int arr[]={33,3,4,5}; 
            char a[]={'1','a','9','b',65,66,97} ;//when '10'is given not accepting bcz 10 is like 2 character 1 and 0
            //printing array using for-each loop  
            for(int i:arr) 
            {System.out.println(i);} 
            System.out.println("out when the character array elements are asssigned to int value in for each loop");
            for(int i:a)
            {
                System.out.println(i);
            }
            System.out.println("output when assigned to char in for each loop");
            for(char i:a)
            {
                System.out.println(i);
            }
              
            
    }
}