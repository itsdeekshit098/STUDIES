package conceptwiserevision;

public class datatypes 
{
    public static void main(String[] args) 
    {
                            //primitve
                    //boolean
        boolean x=true;
        //bool x=true or (1,0); invalid
                    //numeric
                //integral
            //integer
        byte a=-127;//cant be -128 bcz range of byte is from -127 to 128
        short b=2222;
        int c=10;

         //long
        long l=123;//here we assigned 123 to l here what will be happened is the 123 will be in int data type(bcz defalult dataype in java is int for numbers)then it will be implicitly converted to 123L(int to long) to match the data type of the variable lll.this is why it is called implicit datatype conversion or widening
        long ll=123l;
        long lll=123L;
        System.out.println(ll);
        System.out.println(lll);
            //floating point
        //float xx=12.3; //shows error bcz to represent floating points u need to use 12.3f
        float xxc=12.333333333333f;//12.333333333333F  or //float can accept 6-7 decimal places that is why even if u pass meore than 7 decimal place u will get only 6 decimal places as input       
        /* 
        NOTE:
        1)for sure u need to specify f bcz for floating numbers default datatype in java is double so if u try assigning 12.3 to xxc means assigning double value to float which means bigger dt to smaller dt which is impossible in normal scenrio u to use explicit type casting to do this which we will learn in type casting so that is why if u assign the same value to double datatype variable u will get no error
        */
        System.out.println(xxc);

        double d1=12.3;//here 12.3 is of double datatype bcz in java flating point number are of double type by default to save memory in case of arrays of float number with more decimal places
                        //cahracter
        char c1='c';//note u need to use single inverted commas not double if u use them it represents string u can assign string to character bcz primitive to non primitive is not possible
        char c2=65; //assigned ASCII code of A
        System.out.println(c2);//prints A

                            //non primitive
        //strings
        String x1="hansi";
    }
}
