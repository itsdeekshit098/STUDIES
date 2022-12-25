public class stringbuffer 
{
    public static void main(String[] args) {
        StringBuffer x=new StringBuffer("hasni");
        x.insert(2,"vvv");
        System.out.println(x);
        //to delete only one ele (indexoftobedeletet,indexoftobedeletet+1)
        x.delete(0,1);
        System.out.println(x);

        x.append("last");
        System.out.println(x);

    }    
}
