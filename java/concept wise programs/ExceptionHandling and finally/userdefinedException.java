class hi extends Exception
{
    hi(String s)
    {
        super(s);
    }    
}
public class userdefinedException 
{
    public static void main(String[] args) throws hi
    {

        throw new hi("hansi");
    }

}
