class callbyreference
	{  
		 int data=50;  
  		 void change(callbyreference op1)
		{  
			  op1.data=op1.data+100;
 		}  
    		public static void main(String args[])
		{  
			 callbyreference op=new callbyreference(); 
			 System.out.println("before change "+op.data);  
			 op.change(op);//passing object  
			 System.out.println("after change "+op.data);    
 	}	} 
