package arrays;

import java.util.Arrays;

public class mutiplicationOfTwoArrays {
    public static void main(String[] args) 
    {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};  
        int c[][]=new int[3][3];
        System.out.println(a[0].length); 
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<a[i].length;k++)
                {
                    c[i][j]=c[i][j]+((a[i][k])*b[k][i]);
                }
                
            }
        }
          for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        //System.out.println(Arrays.toString(c));
    }
}
