import java.util.Scanner;
class foreachsearch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entert the element to search for");
        int ele=sc.nextInt();
        int k=0;
        int a[]={1,2,3,4,5};
        for(int i:a)
        {
            if(i==ele)
            {
                k=k+1;
            }
        }
        if(k>=1)
        {
            System.out.println("element "+ele+" found");
        }
        else
        {
            System.out.println("element "+ele+" not found");
        }
    }
}
