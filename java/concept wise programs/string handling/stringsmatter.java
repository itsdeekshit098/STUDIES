/*
with respect to string we have 3 things:
                                    1)string objects are immutable(refer string.java)
                                    2)string constructors
                                    3)string methods(refer StringMethods program )
 */

//string constructor

class stringsmatter
{
    public static void main(String args)
    {
        //1)creating empty string 
        String s=new String();
        System.out.println(s);
        
        //2))))
        //string initialized with array of characters

        char arrayofchar[]={'a','b','c'};//initializing array
        //char arrayofchar1[]=new char['a','b','c']; can do this way
        String arraystring=new String(arrayofchar);//creating a stringobject which converts array of chars to  a string 
        System.out.println(arraystring);
        
        //3)))))))))))))))))))
        //creating a string with subrange of character from character array
        //syntax: String(char carrayname[ ], int startIndex, int numChars)
        //let us print range of character from above character array itsef
        //creating a string with  subrange values of already initialized array
        String rangeofchars=new String(arrayofchar,1,2);
        System.out.println("string from subrange values of character array which is declared befor itself: "+rangeofchars );

        //creating a string with  subrange values of array by initializing array in the constructor itself is impossible;

        //String subrangestring=new String(char arrayofchar['a','b','c','d'],0,3);//can initialize in this way u need to declare array before itself

        //4)))))))))))))))))))))) String constructors(contd..)
        //construct a String object that contains the same character sequence as another String object .
        //String(String strObj)
        //Here, strObj is a String object. 

        char c[] = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
        //here in the above program s1 is created with c and s2 is created  with s1 in the string of particular above lines contains 
//          |java   |
//          |s2     |==>s2<==s1

//5)))))))))))))))))))))))
/*
Using ASCII Character Set
String(byte asciiChars[ ])
String(byte asciiChars[ ], int startIndex, int numChars)
asciiChars specifies the array of bytes.
The byte-to-character conversion is done by using The default character encoding of the platform. 

*/
byte ascii[] = {65, 66, 67, 68, 69, 70 };
String s11 = new String(ascii);
System.out.println(s1);
String s22 = new String(ascii, 2, 3);
System.out.println(s2);


}
}