class LinearQueue extends Exception        //user-defined exception class “LinearQueue”
{
    int front,rear;
    final int size=5;
    int q[]=new int[size];

    LinearQueue()
    {
        front=0;
        rear=-1;
    }

    LinearQueue(String s)
    {
        super(s);     //calling constructor of super class Exception
    }

    void enqueue(int ele) throws LinearQueue
    {
        try {
            if (rear == -1 || rear < size-1) {
	   rear=rear+1;
                q[rear] = ele;                  //or q[++rear]=ele; instead of this line and above line
                System.out.println("Q has "+q[rear]+ " at pos "+rear);
            }
            else {
                throw new LinearQueue("Queue is full\n");
            }
        }
       catch(LinearQueue lq) {
            System.out.println(lq.getMessage());
        }
    }

    void dequeue() throws LinearQueue
    {
        try {
            if (front <= rear) {
                System.out.println("Deleted element is " + q[front++]);//front++ means front=front+1
            }
            else {
                if(front>rear)
                    front=-1;
                throw new LinearQueue("No elements to delete");
            }
        }
        catch(LinearQueue lq)
        {
            System.out.println(lq.getMessage());
        }
    }
    void display()
    {
        if(front>-1)
        {
            System.out.println("Elements are");
            int k=front;
            for(int i=k;i<=rear;i++)
                System.out.println(q[k++]);
        }
    }      }

public class Six 
{
    public static void main(String args[]) throws LinearQueue
    {
        LinearQueue q=new LinearQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
