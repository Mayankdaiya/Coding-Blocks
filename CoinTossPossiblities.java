class CoinTossPossiblities{

    public static void ht(int n,String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        char ch='H';
        ht(n,ans+ch);
        char ch1='T';
        ht(n,ans+ch1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ht(n);
    }

}