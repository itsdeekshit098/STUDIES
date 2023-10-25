 class thisconstructor	 
{  
   	int id;      
    String name;  
	thisconstructor() 
    { 
		System.out.println("default constructor is invoked");
	}
	 
	thisconstructor(int id, String name)
   	{  
    	this();  // It is used to invoke current class constructor
		this.id = id;  		
        this.name = name;  
    }  
	void display()
    {		
        System.out.println(id+" "+name);     	
    } 
    public static void main(String[] args) {
        thisconstructor obj=new thisconstructor(1,"hansi");
        obj.display();
    } 	 
}

