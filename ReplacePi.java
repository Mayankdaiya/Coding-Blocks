import java.util.*;
public class ReplacePi {
	public static void replace_pi(int i,String str,String ans){
		if(i==str.length()){
			System.out.println(ans);
			return;
		}
		if(i!=(str.length()-1) && str.charAt(i)=='p' && str.charAt(i+1)=='i'){
			ans+=3.14;
			replace_pi(i+2,str,ans);
		}
		else{
			ans+=str.charAt(i);
			replace_pi(++i,str,ans);
		}

	}

    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			String str=sc.next();
			replace_pi(0,str,"");
		}
    }
}
