/*
Statement: - If 𝑛 pigeons occupy 𝑚 pigeonholes and if 𝑚 < 𝑛 then at least one pigeonhole contains two or more
pigeons
The use of pigeonhole principle is to
• Identify the pigeons (objects)
• Identify the pigeonhole (categories the desired characteristics)
A simple Illustration of above principle is that, If 6 pigeons occupy 4 pigeon holes, then at least one pigeonhole must
contain two or more pigeons in it.
 */
import java.util.Scanner;
class PigeonHole 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 if u know pigeons and pigeon holes|| enter 2 if u know pigeon holes and atlest no of pigeons");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            {
                /*
                 ex:
                 Show that if 30 dictionaries in a library contain a total of 61,327 pages, then one of the dictionaries must have at
                least 2045 pages.
                 */
                System.out.println("enter the no of pigeons");
                int pigeons=sc.nextInt();
                System.out.println("enter the no of pigeon holes");
                int pigeonholes=sc.nextInt();
                int result;
                result=(((pigeons-1)/pigeonholes)+1);
                System.out.println("then one of the pigeon hole will contain atleast"+" "+" "+result);
            }
            case 2:
            {
                /*
                 How many friends must you have to guarantee that at least 5 of them will have birthdays in the same month?
                 */           
                System.out.println("enter the no of pigeon holes");
                int pigeonholes=sc.nextInt();
                System.out.println("enter the no of atleast pigeons in one hole");
                int result=sc.nextInt();
                int pigeons;
                pigeons=((((result-1)*pigeonholes)+1));
                System.out.println("then one of the pigeon hole will contain atleast"+pigeons);
            }
        }
    }
}
