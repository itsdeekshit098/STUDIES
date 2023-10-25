//here if need sum of first 10 number our logic is to add 10+(10-1){n-1}and so on if we give only 
//if (k > 1) and if(k==1) what of if k<1 it sould return something then also right so we need to declare what to be returned at that time so it shows error

import java.util.Scanner;

class sum_of_n_naturalnumbers {
    public static void main(String args[]) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter sum of how many integers u want to find");
        int k = myobj.nextInt();
        int answer = sum2(k);
        System.out.println(answer);

    }

    // public static int sum1(int k) {
    // if (k > 1) {
    // return k + sum1(k - 1);
    //
    // } else if (k == 1) {
    // return 1;
    // } else {
    // return 0;
    // }

    // }

    public static int sum2(int k) {
        if (k > 1) {
            int ans = k + sum2(k - 1);
            return ans;

        } else if (k == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

// int ans;
// ans=n+sum(n-1);
// return ans
