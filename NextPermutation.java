import java.util.*;
public class NextPermutation {
    //swap
    public static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //reverse
    public static void reverse(int i,int j,int arr[])
    {
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    //nextpermutation
    public static  void nextPermutation(int[] nums) {
        if(nums.length==1)
            return;

        int idx1=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        if(idx1<0)
            reverse(0,nums.length-1,nums);
        else{
            int idx2=0;
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[idx1]){
                    idx2=i;
                    break;
                }
            }
            swap(idx1,idx2,nums);
            reverse(idx1+1,nums.length-1,nums);
        }
    }

    public static void main(String args[]) {
		Scanner readme=new Scanner(System.in);
		int t=readme.nextInt();
		for(int k=0;k<t;k++){
		    int n=readme.nextInt();
		    int arr[]=new int[n];

		    for(int i=0;i<arr.length;i++){
		    	arr[i]=readme.nextInt();
		    }
		    nextPermutation(arr);
		    for(int i=0;i<arr.length;i++){
		    	System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
    }

}