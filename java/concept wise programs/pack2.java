import pack123.pack1;
//import pack123.defaultclass; we cannot even import defalutclass as it is default class
public class pack2 {
    public static void main(String args[])
    {
        pack1 obj=new pack1();              //as pack1 class is public we can access and create obj of it
        //defaultclass obj1=new defaultclass(); //as default calss is default class we cannot create obj of it here in a class of other package 
        //System.out.println(obj.x); 
        //we cannot acces x as it is defalut acces modifier so it cannot be acceses by classesin other pacakages but it can be accessed by classes in SAME package
        System.out.println(obj.t);//we can access t  as it is public can be accessed by other packages also

    }
    
}
