/*
 *1)can we use implements for other than interface
 2)multiple inheritance
 */
interface i2
{
    void dosa();
    void idly();
}
abstract class mi1 implements i2{
    public void dosa()
    {
        System.out.println("dosa");
    }

abstract class mi2 implements i2{
    public void idly(){

    }
}


}
public class MultipleInhereitance {
    
}
