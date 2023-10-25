/*
 Command Line Arguments : 
      1)see java supports to pass command line arguments i.e., to pass arguments in run time
      2)String args[] is an array of strings which takes as many values u pass 
      3)so u first compile the program by(u cant in vs code) ;
                                                             javac filename.java
      4)then during run time u need to give or pass arguments as may u need to give no limit  :
                                                            java classname arg1 arg2 arg3 and so on
      5)in program u cant declare only these many values can be taken u can just do how many values or which values to be printed 

      whole concept of commandlinearguments is simple:
                commad line arguments means run time arguments so u passes arguments during run time
 */
public class CommandLineArguments {
    public static void main(String args[])
    {
        System.out.println("length of args[] array is "+args.length);
        System.out.println("passed command line arguments are ");
        for(int i=0;i<args.length;i++)
        {
            System.out.println("elements at index "+i+" "+args[i]);
        }


    }
}
