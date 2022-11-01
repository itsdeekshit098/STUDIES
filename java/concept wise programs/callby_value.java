/*
  if u call a called  function by passing a value then it is known as call by value
 */
public class callby_value 
{
    void hansi(int a)//called function:as it being a called in main method or function
    {
        System.out.println(a);
    }
    public static void main(String args[])//main mehod :calling function as it is calling hansi() method
    {
        callby_value obj =new callby_value();
        obj.hansi(2);
    }
}
