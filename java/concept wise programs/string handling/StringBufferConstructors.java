public class StringBufferConstructors {
    public static void main(String[] args) {
        //StringBuffer(CharSequence chars)
        StringBuffer h=new StringBuffer('A');      //initiates StringBuffer with capcity; of ascii of a
                                                            //capacity with ascii of A=97
        System.out.println(h.capacity());                   //as we are calling method so h.capacity not capacity(h)
        System.out.println(h);                              //prints nothing
        //StringBuffer(String str)
        //StringBuffer h4="hasni"; 
        StringBuffer h1=new StringBuffer("hasni");     //creates a string with capacity of 16+length(string)
        System.out.println(h1);
        //StringBuffer(int size)
        StringBuffer h2=new StringBuffer(10);
        System.out.println(h2);
        //StringBuffer( )  
        StringBuffer h5=new StringBuffer();
        System.out.println(h5);

        /*conclusion:
            1)the arguments we pass other than the string type are considered as capacity
            2)u cant initialize variable of type StringBuffer dirctly with constructor
            3)if char is passed ascii of char is considered as capacity if int is passed capacity is considered as capacity
            4)explanation for below points is on above:
                    Constructors:
                        StringBuffer( )  // Default size is 16 characters.
                        StringBuffer(int size)//string ex: StringBuffer(10) not StringBuffer(int 10)or StringBuffer(int h=10)
                        StringBuffer(String str) // String, with 16 characters extra. StringBuffer(“kkr”)//16+3==capacity 
                        StringBuffer(CharSequence chars)
        */
    }
}
