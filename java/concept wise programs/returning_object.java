public class returning_object 
{
int x=100;
int y=800;
int z=300;
returning_object hansi(returning_object o)//as it should return a value of type returning_object 
{
    o.z=o.x+o.y;
    return o;//returning object o not value of o.z
}
public static void main(String args[])
{
    returning_object obj=new returning_object();
    obj.hansi(obj);
    returning_object h=obj.hansi(obj);
    System.out.println(h);//returns value of object obj as it is assigned  to h
    System.out.println(h.z);//
    System.out.println(obj.z);//

}
}
    
