import java.util.*;
public class GenerateBinaryString {
	public static void pass_str(int i,String str,String ans){
		if(ans.length()==str.length()){
			System.out.print(ans+" ");
			ans="";
			return;
		}
		if(str.charAt(i)=='?'){
			pass_str(i+1,str,ans+"0");
			pass_str(i+1,str,ans+"1");
		}
		else{
			pass_str(i+1,str,ans+str.charAt(i));
		}
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			String str=sc.next();
			pass_str(0,str,"");
			System.out.println();
		}
    }
}