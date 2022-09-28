import java.util.*;
class Dice_permutations{
    // no. of possible ways in which no. can be formed by rolling of a dice
    public static void no_of_possibleWays(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        for(int i=1;i<=6;i++){
            no_of_possibleWays(curr+i,end,ans+i);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        no_of_possibleWays(0,n,"");
    }
}