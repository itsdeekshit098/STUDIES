/*
 static block is executed during the class load event itself
 */
class staticblock
		{
			static
			{
				System.out.println("static block is invoked");
			}
		
			public static void main(String args[])
			{
				System.out.println("hello");
			}
		}

