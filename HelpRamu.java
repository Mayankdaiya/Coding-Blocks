import java.util.*;
public class HelpRamu {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int c1=sc.nextInt(), c2=sc.nextInt(), c3=sc.nextInt(), c4=sc.nextInt();
			int r=sc.nextInt(), c=sc.nextInt(), rik[]=new int[r], cab[]=new int[c];
			int rr=0, cc=0;
			for(int i=0;i<r;i++){
				rik[i]=sc.nextInt();
				rr+=Math.min(rik[i]*c1,c2);
			}
			rr=Math.min(rr,c3);
			for(int i=0;i<c;i++){
				cab[i]=sc.nextInt();
				cc+=Math.min(cab[i]*c1,c2);
			}
			cc=Math.min(cc,c3);
			int res=Math.min((cc+rr),c4);
			System.out.println(res);
		}
    }
}