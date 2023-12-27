 //ee constructor will execute when we create a object of that class
 class ConstructorProof {
    ConstructorProof()
    {
        System.out.println("see constructor will execute when we create a object of that class");
    }
    ConstructorProof(int n,int m)
    {
        System.out.println(m+n);
    }
    public static void main(String args[])
    {
        ConstructorProof obj=new ConstructorProof();
    }
}
