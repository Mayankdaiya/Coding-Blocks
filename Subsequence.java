import java.util.*;
public class Subsequence {
	static int count=0;
	public static void print_sub_sequence(String s, String a){
        if(s.length()==0){
			count++;
            System.out.print(a+" ");
            return;
        }
        char c=s.charAt(0);
        print_sub_sequence(s.substring(1),a);
        print_sub_sequence(s.substring(1),a+c);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print_sub_sequence(str,"");
		System.out.println("\n"+count);
    }
}
