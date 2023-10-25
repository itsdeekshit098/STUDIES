package patterns;

public class pattern22 {
    // public static void main(String[] args) {
    //     int n=4;
    //     for(int i=1;i<(n*2);i++)
    //     {
    //         for(int j=1;j<(n*2);j++)
    //         {
                
    //             if(i==1 || i==7 || j==1 || j==7 )
    //             {
    //                 System.out.print(n);
    //             }
    //             else if(i==2 || i==6 || j==2 || j==6)
    //             {
    //                 System.out.print(n-1);
    //             }
    //             else if(i==3 || i==5 || j==3 || j==5)
    //             {
    //                 System.out.print(n-2);
    //             }
    //              else if(i==4|| i==4 || j==4 || j==4)
    //             {
    //                 System.out.print(n-3);
    //             }
    //             else
    //             {
    //                 System.out.print(" ");
    //             }
    
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        int n=3;
       for(int i=1;i<=n;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print(n-j);
        }
        for(int k=i+1;k<((n*2)-(i));k++)
        {
            System.out.print(n+1-i);
        }
        int h=(n+1-i);
        for(int l=((n*2)-(i));l<=((n*2)-1);l++)
        {
            if(i==n)
            {
                if(i==n && l==n)
                {

                }
                else
                {
                    System.out.print(h+1);
                    h++;
                }

            }
            else{
                System.out.print(h);
                 h++;
            }
            
        }
        System.out.println();
        }
        // for(int i=)
        
        for(int i=n;i>1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(n+1-j);
            }
            for(int k=i;k<=(n*2)-i;k++)
            {
                System.out.print(n-(i-2));
            }
            int o=(n-(i-2));
            for(int l=(n*2)-(i+1);l<((n*2)-2);l++)
            {
                System.out.print(o);
                o++;
            }
            System.out.println();
        }
        
        {
            
        }
    }
}

