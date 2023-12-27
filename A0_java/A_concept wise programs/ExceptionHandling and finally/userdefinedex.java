class hiiii extends Exception
{
    hiiii(String s)
    {
        super(s);
    }    
}

public class userdefinedex 
{
    public static void main(String[] args) 
    {
        try
        {
            throw new hiiii("hi exception");
        }
        catch(hiiii e)
        {
            System.out.println(e.getMessage());
        }
        
    }    
}
