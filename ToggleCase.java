import java.util.*;

public class Playing_with_GoodStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextInt();
        int len=str.length();
        String ans="";
        for(int i=0;i<len;i++){
            int t=str.charAt(i);
            if(t>96){
                t-=32;
            }
            else{
                t+=32;
            }
            ans+=(char)t;
        }
        System.out.println(ans);
    }
}
