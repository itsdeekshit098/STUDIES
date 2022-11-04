  
    //                      finalize method :
    //say if u want to mention something before unreferening object is being killed by the garbage collector u uses finalize method here s1 and s2 are will be killed as there are poiniting to null which means unreferencing objects

    //                        System.gc()
    /*1)garbage collector is a method will is explicitly used to call the garbage collector.normally    garbage collector will automatically removes unreferenced objects if u need to call the garbaeg collector explicitly we uses the gc() method
///IMP 
    2)System.gc() ==>it should be there at the end of the program bcz see for example for a sweeper there should be something to something to sweep similarly if u use gc() at last if there are some unreferenced objects those will be sent to garbage.if u use gc() method in starting itself it comes into exists as there are no unreferenced objects before it  so nothing will be done.
    3)and onemore thing as gc() is last line so the gc comes into picture at last so the s1 and s2 are sent to garbage at last so the functions in finalize method are displayed as last two lines in output(run for output)
    */

    //the garbage collector removes only objects created with new operators
    public class TestGarbage1
    {    
    public void finalize()
    {
        System.out.println("object is garbage collected");
    }  
    public static void main(String args[]){  
    //System.gc();//if gc() will be here nothing will be done exp in 2 point of gc()
     TestGarbage1 s1=new TestGarbage1();  
     TestGarbage1 s2=new TestGarbage1();  
     System.out.println("unreferencing s1");
     s1=null;  //unreferenceing s1
     System.out.println("unreferencing s2");
     s2=null;  
      //calling garbage collector explicitly
      System.gc();
    }  
   }   
    
