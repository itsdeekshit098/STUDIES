/*
                    switch
1)switch is like it navigates to particular case directly instead of checking each case like in else if ladder
2)if u dont use break in cases of switch what happens is the console naviigates to case specified directly like here in below ex navigates to case 3 directly without going to case 1 and 2 then executes whatever in case 3 and then as there is no break so the next cases to case 3 will keep on executing
3)break will makes sures console to exit from switch statement
4)u cannot use continue in cases of switch bcz continue cannot be used outside the loop



 */
package conceptwiserevision;

public class csswitch {
    public static void main(String[] args) {
        int a=3;
        switch(a)
        {
            case 1:
            {
                System.out.println("hansi1");
            }
            case 2:
            {
                System.out.println("hansi2");
            }
            case 3:
            {
                System.out.println("hanis13");
                break;
            }
            case 4:
            {
                System.out.println("hansi14");
            }
        }
    }
    
}
