/*
 static block is executed during the class load event itself
 */
public class static_block 
        {

	        static
			{
				int x=10;
                System.out.println("from static block");
                System.out.println(x);
			}
		
			public static void main(String args[])
			{
                System.out.println("from main method");
				
			}
		}


