


/*
 points for exam:
    1)Scanner package: java.util.Scanner;
 */

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
    Scanner sc=new Scanner(System.in);
    double minbal=1000d;
    void deposit()
    {
        System.out.println("enter the amount to be deposited");
        double dep=sc.nextDouble();
        minbal=minbal+dep;
    }
    void withdraw()
    {
        System.out.println("enter the amount to be withdrawn");
        double wd=sc.nextDouble();
        if((minbal-wd)<1000)
        {
            try
            {
            throw new LessBalanceException("Withdrawn amount ("+wd+") is invalid");
            }
            catch(LessBalanceException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class exp4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Account first=new Account();
        Account second=new Account();
        System.out.println("enter the account number 1:first account 2:second account 3:exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("enter what u want to do");
                System.out.println("1:deposit 2:withdraw 3:balance");
                int ch1=sc.nextInt();
                switch(ch1)
                {
                    case 1:
                    {
                        first.deposit();
                        break;
                    }
                    case 2:
                    {
                        first.withdraw();
                        break;
                    }
                    case 3:
                    {
                        System.out.println(first.minbal);
                    }
                    default:
                    {
                         System.out.println("entered invalid option");
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println("enter what u want to do");
                System.out.println("1:deposit 2:withdraw 3:balance");
                int ch1=sc.nextInt();
                switch(ch1)
                {
                    case 1:
                    {
                        second.deposit();
                        break;
                    }
                    case 2:
                    {
                        second.withdraw();
                        break;
                    }
                    case 3:
                    {
                        System.out.println(first.minbal);
                    }
                    default:
                    {
                        System.out.println("entered invalid option");
                    }
                }
                break;
            }
            case 3:
            {
                break;
            }
            default:
            {
                System.out.println("entered invalid account number or invalid option");
            }
        
        }
    }  
}
