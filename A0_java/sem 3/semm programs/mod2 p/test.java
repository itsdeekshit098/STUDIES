class A
	{
		A getA()
		{		return this;		}		
		void msg()
		{
			System.out.println("ju");
		}
	}
	class test
	{
		public static void main(String[] args)
		{
			new A().getA().msg();
		}
	}
