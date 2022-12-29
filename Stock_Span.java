import java.util.*;
public class Stock_Span {
	public static void main(String args[])  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		Stack<Integer> st=new Stack<>();
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
				st.pop();
			}
			if(!st.isEmpty()){
				a[i]=i-st.peek();
			}
			else{
				a[i]=i+1;
			}
			st.push(i);
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("END");
	}

}
