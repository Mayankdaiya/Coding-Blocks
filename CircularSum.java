import java.util.*;
public class CircularSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int ans=maxsum(arr);
        System.out.println(ans);
	}

	public static int maxsum(int[] arr) {
		int linearsum = kadensAlgo(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = arr[i] * -1;
		}
		int middlesum = kadensAlgo(arr);
		sum += middlesum;
		if (sum == 0) {
			return linearsum;
		}
		return Math.max(sum, linearsum);

	}

	public static int kadensAlgo(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}