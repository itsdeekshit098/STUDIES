class stingcons
{
    public static void main(String[] args) 
    {
        //empty string
        String x=new String();
        System.out.println(x);

        //string created using new keyword
        String x1=new String("hasni");
        System.out.println(x1);


        char a[]={'a','b','c','d','e'};
        //char arr to string
        String c=new String(a);
        System.out.println(c);


        //subrange of char arr to string
        String c1=new String(a,1,3);//dtring(char arr,start index,noofchars)
        System.out.println(c1);


        //st{ring created using array of byte cahr

        byte b1[]={64,65,66,67,68,69};
        String bs1=new String(b1);
        String bs2=new String(b1,1,3);//(byte array,startindex,endindex)
        System.out.println("string of array of byte"+bs1);
        System.out.println("string of subrange of array of byte "+bs2);
    }
    
}