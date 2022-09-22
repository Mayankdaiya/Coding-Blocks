class Fibonacci{

    //print fibonacci series
    public static int fibonacci(int n){
        if(n==1 || n==0) return n;
        int f1=fibonacci(n-1);
        System.out.println(f1);
        int f2=fibonacci(n-2);
        return f1+f2;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}