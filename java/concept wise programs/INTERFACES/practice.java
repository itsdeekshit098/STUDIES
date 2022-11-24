interface i
{
    default void kkr()//what exactly default here is it 
    {
        System.out.println("hansi");
    }
    void hasni()//Abstract methods do not specify a body
        System.out.println("hansi");
    }
}
public class practice {
    
    i obj=new i();//Cannot instantiate the type(interface type) I
}
