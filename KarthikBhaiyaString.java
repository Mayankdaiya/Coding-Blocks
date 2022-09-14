import java.util.*;
public class KarthikBhaiyaString {
    
	public static int maxcount(String str, char ch,int k){
		int ans=0;
		int i=0, j=0, flip=0;
		while(j<str.length()){
			if(str.charAt(j)==ch){
				flip++;
			}
			while(flip>k){
				if(str.charAt(i)==ch){
					flip--;
				}
				i++;
			}
			ans=Math.max(ans, j-i+1);
			j++;
		}
		return ans;
	}

    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int a=maxcount(str,'b',n);
		int b=maxcount(str,'a',n);
		System.out.println(Math.max(a,b));
    }
}