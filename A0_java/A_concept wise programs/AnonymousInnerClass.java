class popcorn
{   
    void taste()
    {
        System.out.println("sweet");
    }

}
class AnonymousInnerClass 
{
    public static void main(String args[])
    {
        popcorn obj=new popcorn();
        popcorn obj1=new popcorn()//it is like we are extending parent class with anonymous class with no name
        //what it indicates is ur parent class reference is holding a child class object and defination of that anonymous class is below one in {}
        {
            void taste()
            {
                System.out.println("mixed");//it doesn changes  the method in class directly by 14 line the new child class with no name is created(anonymous class)where in which all fields are copied and the defination given in {} is writen in that anonymous class
        
            }
        };
        obj1.taste();
        obj.taste();
    }
    
}
