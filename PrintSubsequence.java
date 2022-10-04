class PrintSubsequence{
    //print subsequence
    public static void subsequence(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        subsequence(str.substring(1),ans);
        subsequence(str.substring(1),ans+ch);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        subsequence(str,"");
    }
}