  
    //finalize method :say if u want to mention some before unreferening object is being killed by the garbage collector u uses finalize method here s1 and s2 are will be killed as there are poiniting to null which means unreferencing objects
    //gc():garbage collector is a method will is explicitly used to call the garbage collector.normally garbage collector will automatically removes unreferenced objects if u need to call the garbaeg collector explicitly we uses the gc() method

    //the garbage collector removes only objects created with new operator
public class TestGarbage1{    
    public void finalize()
    {
        System.out.println("object is garbage collected");
    }  
    public static void main(String args[]){  
     TestGarbage1 s1=new TestGarbage1();  
     TestGarbage1 s2=new TestGarbage1();  
     System.out.println("unreferencing s1");
     s1=null;  //unreferenceing s1
     System.out.println("unreferencing s2");
     s2=null;  
     System.gc(); //calling garbage collector explicitly
    }  
   }   
    
