/* 
final variacle:
1)variable decalared as final cant be changed 
2)if we want to declare a intance variable as final we need to intialize and declare in same line itself
3)in case of a variable other than intance variable u can declare in one line and initialize in another line

final method:
1)see if u declare a method as final u cant overide(override in the sence methods with same names in parent and subclass but statements differs) it.
2)u can get dout like what if i used to declare methods with same statements it deosnt work bc if method is declared as final u cant use the method name again it shaows error there itself
 
final class:
1)if u declare a class as final u cant use it for extending i.e., for inheritance purpose bcz see if u have a class x and if u want another class y (class y extend x) to extend its properties then see u can say like class(refer 17-26)) y inheriting  class x properties we are not changing values then why cant we extend y with class final x.
the reason is :(
     #see if u inherit class x properties into y u can even change its values in class y as class x fields are int class y;
*/

//#final variable
class hi {
    final int x = 20;// u need to initialize here itself refer point 2

    void ktr() {
        final int u;
        u = 20;
        // or
        final int yuj = 90;
    }
}

// #final method
class trg 
{
    final void hansi12() {
        System.out.println("kkr");
    }
}

// overriding in other class
/* 
 class trg2 extends trg
 {
 void hansi12()
 {
 System.out.println("kkr12");
 
 }
 }
 */
 
 

// #final class:

final class hansi {
    int x = 10;
}

class hansi1 extends hansi {
    void kkr() {
        x = 20;
    }
}
