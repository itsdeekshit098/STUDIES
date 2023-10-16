public class conditional {
    public static void main(String[] args) {
        int volt=2;
        int k=100;
        if(volt>0 && volt<3)
        {
            if(k==100)
            {
              System.out.println("led velagali");  
            }
            
            
        }
        else if(volt>3 && volt<10)
        {
            System.out.println("motor run kavali");
        }
        else if(volt>10 && volt<13)
        {System.out.println("de motor");
        }
        else if( volt>13 && volt<100)
        {
            System.out.println("fan ");
        }
    }
}
