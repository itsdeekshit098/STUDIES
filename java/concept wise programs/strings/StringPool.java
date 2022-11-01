/*
 string pool :
    1)in java every string is stored in string pool the main thing of java string pool is if u hava 2 variable a and b and has same value hansi then in string pool if a is initializes with hansi then a block with hansi is created the again if u assign hansi to b then nonew block is created for hansi the b also will refers to the hansi of a itself 

    |hansi| <==a,b
    |-----|

    2)how to verify whether the variables poiting to same reference see below example


 */
 public class StringPool
{
    public static void main(String args[])
    {
        String h1="hansi";
        String h2="hansi";
        if(h1.equals(h2))
        {
            System.out.println("equal");
        }
        if(h1==h2)//The method elif(boolean) is undefined for the type StringPool so not using elif
        {
        System.out.println("both variables pointing to same reference in string pool");
        
        }
        else
        {
        System.out.println("both variables are not same");
        }

    }
}