public class A6_getting_class_name_of_array {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[][]={{1,2,3},{4,5,6}};
        char c[]={65,66,67};
        System.out.println(a.getClass().getName());
        //or
        Class x=b.getClass();
        String y=x.getName();
        System.out.println(y);//prints [[I means twobrackets-2 dime and I intteger type

        System.out.println(c.getClass().getName());// [c -means 1 dim character type array

    }
}
