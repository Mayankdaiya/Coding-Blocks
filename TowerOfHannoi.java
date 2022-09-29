import java.util.*;

class TowerOfHannoi{

    public static void toh(int n,String src,String hlp,String dest){
        if(n==0) return;
        toh(n-1,src,dest,hlp);
        System.out.println("Move"+n+"th disc from "+src+" to "+dest);
        toh(n-1,hlp,src,dest);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String src="A";
        String hlp="B";
        String dest="C";
        toh(n,src,hlp,dest);
    }
}