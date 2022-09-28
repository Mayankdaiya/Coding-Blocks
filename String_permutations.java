import java.util.*;
class String_permutations{
    public  static  void  print_string_permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int j=0;j<str.length();j++){
            char a=str.charAt(j);
            String s1=str.substring(0,j);
            String s2=str.substring(j+1);
            print_string_permutation(s1+s2,ans+a);
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        print_string_permutation(str,"");
    }
}