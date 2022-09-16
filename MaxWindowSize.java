public class MaxWindowSize {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int k = sc.nextInt();
		System.out.println(MaxWindowSum(arr, k));
	}

	public static int MaxWindowSum(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		int ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];

			sum -= arr[i - k];
			ans = Math.max(ans, sum);

		}
		return ans;
	}
}