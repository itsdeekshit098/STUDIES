/*
 a. A class "Account" with minimum balance 1000rs, deposit() method to deposit amount,
withdraw() method to withdraw amount and also throws LessBalanceException if an account
holder tries to withdraw money which makes the balance less than 1000rs.
b. A class "LessBalanceException" which returns the statement that says "withdraw amount ( __
rs) is not valid"
c. A class which creates 2 accounts through which both deposit and withdraw operations are
performed. Appropriate action has to be taken for LessBalanceException.
 */
import java.util.Scanner;
class LessBalanceException extends Exception
{
    LessBalanceException(String r)
   {
     System.out.println("withdraw amount is not valid");
   }
}
class Account
{

    double minbal=1000;
    Double deposit()
    {  
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the amount to be deposited");
        double h=sc1.nextDouble();
        minbal=minbal+h;
        return minbal;
    }
    void withdraw()
    {
        //LessBalanceException obj=new LessBalanceException();
        Scanner sc2=new Scanner(System.in);
        System.out.println("enter the amount to be withdrawn");
        double bal=sc2.nextDouble();
        try
        {
            if(bal<1000)
            {
                throw new LessBalanceException("kkr");
            }
            System.out.println("hansi");
        }
        catch(LessBalanceException ex)
        {
            
        }

        }
       
    public static void main(String args[])
    {
        int h=10;
        System.out.println(h);
       

        
    }
    
}
