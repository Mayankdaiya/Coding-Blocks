import java.util.*;

public class Playing_with_GoodStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextInt();
        int len=str.length();
        int max=0, sum=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                sum++;
                max=Math.max(sum,max);
            }
            else{
                sum=0;
            }
        }
        System.out.println(max);
    }
}
