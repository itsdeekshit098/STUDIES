public class intss {
    public static void main(String[] args) {
        System.out.println(hansi());
    }
   public static int hansi()
   {
    int x=-123;;
    int num=x;
    int lnum=0;
    int digit=0;
    while(num!=0)
    {
        digit=num%10;
        lnum=lnum*10+digit;
        num=num/10;
        System.out.println(lnum);
    }
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(x);
    System.out.println(x>Integer.MAX_VALUE);
    System.out.println(x<Integer.MIN_VALUE);
    System.out.println(lnum);
    if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE)
    {
        return 0;
    }
    if(x<0)
    {
        return (-1*lnum);
    }
    else
    {
        return lnum;
    }
    }
}


