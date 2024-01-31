/**
 * po
 */
public class po {

    public static void main(String[] args) {
       int arr[] = {10, 14, 29, 21, 17, 4, 18, 20, 18, 22, 21, 14, 27, 12, 3, 28, 17, 0, 2, 18, 8, 20, 26, 16, 9, 23, 25, 20, 7, 27, 5, 7, 16, 5, 25, 11, 3, 7, 2, 17, 14, 6, 12, 14, 23, 25, 26, 5, 18, 1, 6, 10, 9, 12, 2, 25, 29, 12, 19, 4, 8, 5, 8, 30, 2, 22, 24, 30, 7, 24, 8, 15, 16, 2, 11, 20} ;
        
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr)
    {
        // your code here
        int count=0;
        int x;
        for(int i=0;i<arr.length-1;)
        {
            System.out.println(arr[i]);
            //System.out.println(i);
            if(arr[i]==0 && i<arr.length)
            {
                return -1;
            }
            else
            {
                if(i<i+arr[i]+arr.length)
                {
                    i=i+arr[i];
                }
                else{
                    i=arr.length+1;
                }
               // System.out.println(arr[i]);
                //System.out.println(i);
                
            }
            count=count+1;
        }
        return count;
    }
}