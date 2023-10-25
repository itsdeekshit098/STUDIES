package codingninjas;
   import java.util.*;
public class sumofEvenOddinInteger1 
{
 
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ea[]=new int[10];
        int eo[]=new int[100];
		int i=0;
		int j=0;
        int ld;
        int sume=0;
        int sumo=0;
		while(n>(0))
		{
			ld=n%10;
            //System.out.println(ld);
			if(ld%2==0)
			{
				ea[i]=ld;
				i++;
			}
			else if(ld%2!=0)
			{
				eo[j]=ld;
				j++;
			}
            n=n/10;
            
		}
        //System.out.println(Arrays.toString(ea));
        for(int i1:ea)
        {
            sume=sume+i1;
        }
        for(int j1:eo)
        {
            sumo=sumo+j1;
        }
        System.out.println(sume);
        System.out.println(sumo);


	}
}

