 class outer3
{ 
    private int x=7;
    public void makeinner()
    {
        inner3 in =new inner3();
        in.display();
    }
    class inner3
    {
        public void display()
    	  {
        	System.out.println(x);
    	  } 
    }
    public static void main(String[] args) 
    {
        outer3 obj=new outer3();
        obj.makeinner();;
    }
    
}
