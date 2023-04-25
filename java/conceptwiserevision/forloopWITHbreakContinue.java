/*
 syntax:
    1)for(var,condition,incre/decre) //note var need to be declared and intialized 
    2)for loop is used to iterate certain code certain times
    3)continue keyword wont let the code below continue statement to be executed in the particular iteration 
    4)break will let the console to exit from the loop
 */
package conceptwiserevision;

public class forloopWITHbreakContinue
{
 public static void main(String[] args) 
 {
    int a=10;
    for(int i=0;i<10;i++)
    {
        if(a==5)
        {
            a--;
            continue;
        } 
        else if(a==2)
        {
            break;
        } 
        else
        {
            System.out.println(a);
            a--;
        }
    }
 }
}    

