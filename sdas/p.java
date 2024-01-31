class p{
    static void sumOfDivisors(int N){
        // code here
        int count=0;
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    System.out.println(i+" "+j);
                    count=count+1;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        sumOfDivisors(4);
    }
}