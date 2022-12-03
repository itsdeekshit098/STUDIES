
/*
string vs stringBuffer
No.	String	StringBuffer
1)	The String class is immutable.	The StringBuffer class is mutable.
2)	String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance.	StringBuffer is fast and consumes less memory when we concatenate the strings.
3)	String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.	StringBuffer class doesn't override the equals() method of Object class.
/
String k="hasni";
        String kk="hasni";
        if(k.equals(kk))
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(k==kk){
            System.out.println("both variables are refering to same referenc in string pool ");
        }
/
4)	String class is slower while performing concatenation operation.	StringBuffer class is faster while performing concatenation operation.
5)	String class uses String constant pool.	StringBuffer uses Heap memory

StringBuffer;
1)default capacity of string buffer is 16 if more the 16 letters or characters  are  given to an object(used obj bcz StringBuffer is a class in java everything is object and class)of stringBuffer then the capacity becaomes (oldcapacity*2)+2 
see for ex:line no 22 to 30
2)if u inseret characters more than the default capacity then jvm on its own increases the capacity of the object of type stringBuffer as per the following formulae ==((oldcapacity*2)+2) refer line 22 to 30 for clarity
*/
 class StringBuffer1 //if u use StringBuffer then it throws error as there is a class StringBuffer already because StringBuffer is class by default already
  {
   public static void main(String args[]) 
   {
    StringBuffer obj1=new StringBuffer();//stringbuffer with default size without input
    System.out.println(obj1.length());//length will be 0
    System.out.println(obj1.capacity());
    StringBuffer obj2=new StringBuffer("hasni");
    System.out.println(obj2.length());
    System.out.println(obj2.capacity());//capacity=no.of.iniatiazedobj+16==21
    obj2.append("01234567899");//now here we added +11 character so 11+5=16(noofcharsin "hansi")
    obj2.append("1");//now 16+1==17(now also as capacity is 21 now there will be 17 u might think that 16is capacity so croseed that so capacity should become w.r.t(oldcapacity*2)+2) 
    System.out.println(obj2.capacity());
    obj2.append("12345");//now 17+5==22 so crosses 21 so jvm on its own increases the capacity of the object of type stringBuffer as per the following formulae ==((oldcapacity*2)+2)

    StringBuffer s3=new StringBuffer(50);//StringBuffer(int): Creates an empty string buffer with the specified initial capacity.
    System.out.println(s3.capacity());//
   }
}
