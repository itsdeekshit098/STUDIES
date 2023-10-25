package patterns;

public class pattern17 {
    
    public static void main(String[] args) {
       int n=3;
       for(int i=0;i<n;i++)
       {
           char d=(char)(64+i);
           char c=(char)(65);
           for(int j=1;j<n-i;j++)
           {
               System.out.print(" ");
           }
           for(int k=n-i;k<=n;k++)
           {
               
               System.out.print(c+" ");
               c++;
           }
           for(int l=(n+1);l<=(n+i);l++)
           {
               System.out.print(d+" ");
               d--;
           }
           System.out.println();
       } 
    }
}
