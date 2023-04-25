/*
dowhile;
    syntax:
        do{code including incre/decre operation}while(condition);
1)for first time in do while the code in do is executed without checking condition then later on until the condition in while becomes false the code will be executing
2)so in dowhile loop the code will be executed atleast once
 */
package conceptwiserevision;

public class dowhileloop {
    public static void main(String[] args) 
    {
        int i=1;
        do{
            System.out.println("hanie");
            i++;
        }
        while(i<5);
    }
}
