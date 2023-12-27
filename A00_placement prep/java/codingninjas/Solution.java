package codingninjas;
import java.util.*;
public class Solution 
{
    
    public static void main(String[] args)
     {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        if(Character.isUpperCase(b)==true)
        {
            System.out.println(1);
        }
        else if(Character.isLowerCase(b)==true)
        {
            System.out.println(0);
        }
        else if(Character.isLetter(b)==false)
        {
            System.out.println(-1);
        }
        else
        {

        }
    }

    }