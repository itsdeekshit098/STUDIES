/*
 call by reference:
    1)call by reference in the sense u pass reference as argument instead of value.
    2)if u see in the below program first look at main method we passed obj(reference(copy)of class ) as argument to function hansi and then come to hasnsi look at the parameter the data type of parameter is call_by_reference as class name is call_by_reference it will be the type.
    3)the members or fields of class or obj are copied to o and we can logically say o is also object now here as we declared in parameter 
    4)then in the method we used to add x and y by o.x and o.y(as all data fields are passed as arguments into o) not obj.x+obj.y
 */
public class call_by_reference {
    int x=10;
    int y=20;
    void hansi(call_by_reference o)
    {
        
        int z;
        z=o.x+o.y;
        System.out.println(z);
    }
    public static void main(String args[])
    {
        call_by_reference obj=new call_by_reference();
        obj.hansi(obj);
    }
}
