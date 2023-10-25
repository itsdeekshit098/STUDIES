 class static_nested_class {
  
		  static int data=30;  
		  static class Inner
		  {  
			   static void msg(){System.out.println("data is "+data);}  
		  }  
		  public static void main(String args[])
		  {  
            static_nested_class.Inner.msg();//no need to create the instance of 
					            // static nested class  
                                
                            //or 
            static_nested_class.Inner obj1=new static_nested_class.Inner();
            obj1.msg();
         } 
        }
