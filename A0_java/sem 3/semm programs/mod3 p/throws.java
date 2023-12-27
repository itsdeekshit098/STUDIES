class ex extends Exception
{
    ex(String s)
    {
        super(s);
    }
}

class hasni
{
    public static void main(String[] args) throws ex,InterruptedException
    {
        Thread.sleep(10000);
        System.out.println("hansi");  
        throw new ex("thrown exception");
    }
}