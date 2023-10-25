package op;
import calculator.*;
import java.util.Scanner;
public class Op {
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int i=1;
while(i>0)
{
System.out.println("select the below option"); 
System.out.println("1:addition 2:subtraction 3:multiplication 4:division 5:exit");
int ch=sc.nextInt();
switch(ch)
{
    case 1:
    {
        addition obj=new addition();
        obj.add(1,2);
        break;
    }
    case 2:
    {
        subtraction obj1=new subtraction();
        obj1.subtraction(2,1);
        break;
    }
    case 3:
    {
        multiplication obj2=new multiplication();
        obj2.multiplication(2,3);
        break;

    }
    case 4:
    {
        division obj3=new division();
        obj3.division(4,2);
        break;
    }
    case 5:
    {
        i=0;
        break;
    }
}


}
}    
}
