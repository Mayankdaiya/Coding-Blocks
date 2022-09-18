import java.util.*;

public class Playing_with_GoodStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextInt();
        int len=str.length();
        String ans="";
        ans+=str.charAt(0);
        for(int i=0;i<len;i++){
            if(str.charAt(i)==str.charAt(i-1)) continue;
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
}
