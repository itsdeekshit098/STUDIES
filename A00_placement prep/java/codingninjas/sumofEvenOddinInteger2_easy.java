package codingninjas;
import java.util.*;
public class sumofEvenOddinInteger2_easy 
{
	public static void main(String[] args) 
	{
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int ld;
        int sume=0;
        int sumo=0;
		while(n>(0))
		{
			ld=n%10;
            //System.out.println(ld);
			if(ld%2==0)
			{
				sume=sume+ld;
			}
			else if(ld%2!=0)
			{
				sumo=sumo+ld;
			}
            n=n/10;
            
		}
        //System.out.println(Arrays.toString(ea));
        System.out.print(sume+" "+sumo);
    }}