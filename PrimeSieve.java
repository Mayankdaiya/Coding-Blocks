class PrimeSieve{
    public static void primesieve(int n){
        boolean[] arr=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i*i<arr.length;i++){
            if(!arr[i]){
                for(int j=2;i*j<=n;j++){
                    arr[i*j]=true;  //not prime set kar diya
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]) System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int n=10;
        primesieve(n);
    }
}