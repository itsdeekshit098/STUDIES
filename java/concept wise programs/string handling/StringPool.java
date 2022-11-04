/*
 string pool :
    1)in java every string is stored in string pool the main thing of java string pool is if u hava 2 variable a and b and has same value hansi then in string pool if a is initializes with hansi then a block with hansi is created the again if u assign hansi to b then nonew block is created for hansi the b also will refers to the hansi of a itself 

    |hansi| <==a,b
    |-----|

    2)how to verify whether the variables pointing to same reference see below example


 */
 public class StringPool
{
    public static void main(String args[])
    {
        String h1="hansi";
        String h2="hansi";
        String h3=new String(h2); //it means string h3 refers to h2 see at end of program
        if(h1.equals(h2))
        {
            System.out.println("equal");
        }
        if(h1==h2)//The method elif(boolean) is undefined for the type StringPool so not using elif
        {
        System.out.println("both variables pointing to same reference in string pool");
        }
        if(h2.equals(h3))
        {
            System.out.println("h2 and h3 are equal");
        }
        if(h2==h3)
        {
            System.out.println("h2 and h3 are referencing to same block in String pool");
        }
        if(!(h2==h3))
        {
            System.out.println("h2 and h3 are not referencing to same block in String pool");
        }
        else
        {
        System.out.println("both variables are not same");
        }

    }
}
/*
 String pool for above program; 
|"hansi"|==>h1,h2
|h2     |==>h3(h3 refers to h2)
|       |
|       |
not in the below manner 
|"hansi"|==>h1
|"hasni"|==>h2
|h2     |==>h3

 */
