class  Outer
{
    int  outdata = 22;
    void  display()
    {
        Inner  inobj = new  Inner();
        System.out.println("Accessing from outer class");
        System.out.println("The value of outdata is " +outdata);
        System.out.println("The value of indata is "   +inobj.indata);
    }
    class  Inner
    {
        int  indata = 20;
        void  inmethod()
        {
            System.out.println("Accessing from inner class");
            System.out.println("The sum of indata & outdata is " +(outdata + indata));
        }
    }
}

 class InnerclassDemo {
    public  static  void  main(String  args[])
    {
        Outer  outobj  = new Outer();
        outobj.display();
        Outer.Inner  inobj1 = outobj.new  Inner();
        inobj1.inmethod();
    }
}

