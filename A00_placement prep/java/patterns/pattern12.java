package patterns;

public class pattern12 {
    // public static void main(String[] args) 
    // {
    //    int n=4;
    //         for(int i=1;i<=n;i++)
    //         {
    //             for(int j=1;j<=i;j++)
    //             {
    //                 System.out.print(j+" ");
    //             }
    //             for(int j=1;j<=((n+n)-(i*2));j++)
    //             {
    //                 System.out.print(" ");
    //             }
    //             for(int k=i;k>=1;k--)
    //             {
    //                 System.out.print(k+" ");
    //             }
    //             System.out.println();
    //         }
    // }
        public static void main(String[] args) 
        {
            int n=4;
            for(int i=1;i<=n;i++)
            {
                int l=1;
               int k=i;
               for(int j=1;j<=(n+n);j++)
               {
                    
                   if(j>=1 && j<=i)
                   {
                       System.out.print(l+" ");
                       l++;

                   }
                   else if(j>i && j<=((n+n)-i))
                   {
                       System.out.print(" ");
                   }
                   else
                   {
                     System.out.print(k+" ");
                     k--;  
                   }
               }    
               
               System.out.println();
            }
            
        }
            
            
        }
    

