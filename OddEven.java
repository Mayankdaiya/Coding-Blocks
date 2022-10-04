import java.util.*;

public class Playing_with_GoodStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextInt();
        String ans="";
        for(int i=0;i<len;i++){
            if(i%2==0){
                int t=str.charAt(i)+1;
                ans+=(char)t;
                continue;
            }
            int t=str.charAt(i)-1;
            ans+=(char)t;
        }
        
        System.out.println(ans);
    }
}

