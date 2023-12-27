package conceptwiserevision;

public class increment_decrement 
    {
        public static void main(String args[]) {
            int a = 10;
            int b = 10;
            System.out.println(a++ + ++a); // 10 + 12 = 22
            System.out.println(b+++b++); // 10 + 11 = 21
        }
    }
    
/*
 1)(a++ + ++a)=>here first a++ returns value of a and then increments so returns 10 then a is incremented by 1 to 11 then ++a increments first then returns so as now value of a is 11 then ++a increments by 1 to 12 then return 12 then the addition operation occurs (10+12)==>22
 2)similarly in the case of (b++ + b++)
 */