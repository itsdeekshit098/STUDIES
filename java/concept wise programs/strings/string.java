/*
 1)string is class that is why s of String is a capital letter 
 2)obj of strings are immutable:(refer program to have clarity on below points)
       1)see if u create a string 
 */
//analysis;
/*
 1)the whole thing is u cant change values of string objects directly the changed values will or can be assigned to other objects

 2)u will be having a dout how to change value of string directly it is possible if u use string buffer to initialize value refer to string buffer program for clarity
 */
public class string {
    public static void main(String args[])
    {
        String h="hansi";
//==.>IMP AS STRING  is also CLASS it can be initilalized in below way direclty this proves string is class
        String obj=new String("ahnsi");
        System.out.println(obj);
        h.concat("123");//what happens here is string 123 is added to hansi and refers to some x obj value of h wont be changed.but string hansi123 will be created and refers to some imaginary obj.if u assign it to some variable then hansi123 will be assigned to it
        System.out.println(String.format("value of h after conatenention %s",h));//%s==>strings
                                                                                        //%d==>integers
        //string.format will be very useful if u need to print any value in middle of text whereever u want in a simple way

        String h1=h.concat("123");
        System.out.println("value of h after concatenation assigning to obj"+h);
        //or
        System.out.println(String.format("value of h after concatenation assigning %s to obj",h1));
        System.out.println(h1);
        //obj.append("ai");
    }
}

//analysis;
/*
 the whole thing is u cant change values of string objects directly the changed values will or can be assigned to other objects
 */