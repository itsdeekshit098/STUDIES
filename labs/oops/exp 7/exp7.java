import java.util.Scanner;
interface stackoperations
{
    void push(int ele);
    void pop();
    void display();
}
class fixedstack implements stackoperations
{
    public int top=-1;
    int a[]=new int[5];
    public void push(int ele)
    {
        if(top<4)
        {
            top=top+1;
            a[top]=ele;
        }
        else{
            System.out.println("stack overflow");
        }
       
    }
    public void pop()
    {
        if(top!=-1)
        {
            System.out.println("deleted element is :"+a[top]);
            top--;
        }
        else
        {
            System.out.println("stack underflow"); 
        }
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("the stack is empty");
        }
        else{
            System.out.println("the elements of stack are:");
            for(int i=top;i>-1;i--)
            {
                System.out.println(a[i]);
            }
        }
    }
}
class dynamicstack implements stackoperations
{
    int size;
    public int top=-1;
    int a[]=new int[100];
    public void push(int ele)
    {
        if(top<size-1)
        {
            top=top+1;
            a[top]=ele;
        }
        else{
            System.out.println("stack overflow");
        }
       
    }
    public void pop()
    {
        if(top!=-1)
        {
            System.out.println("deleted element is :"+a[top]);
            top--;
        }
        else
        {
            System.out.println("stack underflow"); 
        }
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("the stack is empty");
        }
        else{
            System.out.println("the elements of stack are:");
            for(int i=top;i>-1;i--)
            {
                System.out.println(a[i]);
            }
        }
    }
}

class stackinterface 
{
    
    public static void main(String[] args) 
    {
        fixedstack obj=new fixedstack();
        dynamicstack obj1=new dynamicstack();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        
        int i=1;
        while(i>0)
        {
            int kk=1;
            System.out.println("1:fixed stack 2:dynamic stack 3:exit");
            int ch=sc.nextInt();
            while(kk>0)
            {
            switch(ch)
            {
                case 1:
                {
                    int rtr=1;
                    while(rtr>0)
                    {
                    System.out.println("select the option below");
                    System.out.println("1:push 2:pop 3:diplay 4:exit");
                    int ch1=sc.nextInt();
                    switch(ch1)
                    {
                        case 1:
                        {
                            System.out.println("enter the element u want to push");
                            int ele=sc.nextInt();
                            obj.push(ele);
                            break;
                        }
                        case 2:
                        {
                            obj.pop();
                            break;
                        }
                        case 3:
                        {
                            obj.display();
                            break;
                        }
                        case 4:
                        {
                            rtr=0;
                            break;
                        }
                    }
                }
                    break;
                
                        
                    }
               
                case 2:
                {
                    int rk=1;
                    System.out.println("enter the size of stack");
                    obj1.size=sc.nextInt();
                    while(rk>0)
                    {
                    System.out.println("select the option below"); 
                    System.out.println("1:push 2:pop 3:diplay 4:exit");
                    int ch1=sc.nextInt();
                    switch(ch1)
                    {
                        case 1:
                        {
                            System.out.println("enter the element u want to push");
                            int ele=sc.nextInt();
                            obj1.push(ele);
                            break;
                        }
                        case 2:
                        {
                            obj1.pop();
                            break;
                        }
                        case 3:
                        {
                            obj1.display();
                            break;
                        }
                        case 4:
                        {
                            rk=0;
                            break;
                        }
                        
                        
                    }
                    }
                    break;
                }
                }
            }


        }
        
    }
}