class sum{
    static int getSum(int n) //n=342
    {
        int sum = 0; //auto 
        while(n!=0) // 342!=0
        {
            sum= sum +n%10; 
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=342;
        System.out.println("Sum of "+n+ " is "+getSum(n));
    }
}
