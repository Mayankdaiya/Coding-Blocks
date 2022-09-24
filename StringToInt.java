import java.util.*;
public class StringToInt {
	public static void print_str(int i,String str){
		if(i==str.length()) return;
		int n=str.charAt(i)-48;
		System.out.print(n);
		print_str(++i,str);
	}
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	   String str=sc.next();
	   print_str(0,str);
    }
}
