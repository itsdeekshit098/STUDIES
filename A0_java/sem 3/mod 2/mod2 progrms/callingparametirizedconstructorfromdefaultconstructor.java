
class callingparametirizedconstructorfromdefaultconstructor{  
    callingparametirizedconstructorfromdefaultconstructor()
    {  
    this(5);  
    System.out.println("hello a");  
    }  
    callingparametirizedconstructorfromdefaultconstructor(int x){  
    System.out.println(x);  
    }  
    }  
    class TestThis6{  
    public static void main(String args[]){  
    callingparametirizedconstructorfromdefaultconstructor a=new callingparametirizedconstructorfromdefaultconstructor();  
    }}  