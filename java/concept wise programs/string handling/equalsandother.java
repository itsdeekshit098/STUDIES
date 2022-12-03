

// Java program to demonstrate
// the toString() Method.
  
class equalsandother{
    public static void main(String[] args)
    {
        String k="hasni";
        String kk="hasni";
        if(k.equals(kk))                                    //String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(k==kk){
            System.out.println("both variables are refering to same referenc in string pool ");
        }
        StringBuffer r1=new StringBuffer("kker");
        StringBuffer r=new StringBuffer("kker");
        System.out.println(r1.equals(r));                   //StringBuffer class doesn't override the equals() method of Object class.
        System.out.println(r1==r);
        k.concat(kk);
        r1.append(r);
        
    }
}