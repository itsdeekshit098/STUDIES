public class stringfromstrigbuffer {
  public static void main(String[] args) {
    StringBuffer x=new StringBuffer("hansi");
    String x1=new String(x);
    System.out.println("string buffer: "+x);
    System.out.println("string from string buffer: "+x1);
  }  
}
