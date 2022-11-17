 import java.util.Scanner;
 class LessBalanceException extends Exception
 {
    LessBalanceException(String s)
    {
        super(s);
    }
 }
 
 class Account
{
   static double minbal=1000;  //note u can give access specifiers to instance variables not for variable in methods the scope varibles declared in method will be in that mwthod itself
    static Double deposit()
    {
        System.out.println("enter the amount to be deposited");
        Scanner sc=new Scanner(System.in);
        double dep=sc.nextDouble();
        minbal=minbal+dep;
        return minbal;
    }
    static void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to be withdrawn");
        double wa=sc.nextDouble();
        double k;
        k=minbal-wa;
        if(k>=1000)
        {
            minbal=minbal-wa;
        }
        else{
            try
            {
                throw new LessBalanceException("balance will become less than minbal");//note in throw u should call an obj of type throwable(throwable means which are of excepption class)
            }
            catch(LessBalanceException ex)
            {
                System.out.println(ex.getMessage());//if i comment out this it will be like catch with no mssg to be printed 
            }
        }
    }
    static void balance()
    {
        System.out.println("the balance in ur account is"+" "+minbal);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=1;
        while(c==1)
        {
        System.out.println("1:deposit 2:withdraw 3:balance 4:exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {   
                deposit();
                break;
            }
            case 2:
            {
                withdraw();
                break;
            }
            case 3:
            {
                balance();
                System.out.println("jjr");
                break;
            }
            case 4:
            {
                c=0;
                break;
            }


        }
    }
    }
}
