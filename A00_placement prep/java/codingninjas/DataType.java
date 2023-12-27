package codingninjas;

import java.util.*;
public class DataType 
{       
    double x1(){
        return 0;
    }
    int a[]={};
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        // DataType obj=new DataType();
        // obj.dataTypes(a);
        System.out.println(dataTypes(a));;
        int a12[]={1,2,3,4};
        System.out.println(a12);
        
    }
    public static int dataTypes(String type) 
    {
        System.out.println("enterd into dataTpypes method   ");
        // Write your code here
         if(type.equals("Integer"))
        {
                return 4;
        }
            else if(type.equals("Long"))
        {
            return 8;
        }
        else if(type.equals("Float"))
        {
            return 4;
        }
        else if(type.equals("Double"))
        {
            return 8;
        }
        else if(type.equals("Character"))
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
        
    }
    
    
}
