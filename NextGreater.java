import java.util.Stack;

class NextGreater{
    public static int[] getnextgreater(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                ans[s.pop()]=arr[i];
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            ans[s.pop()]=-1;
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[]={10,2,1,3,5,4,8,7};
        int newarr[]=getnextgreater(arr);
        for(int i=0;i<arr.length;i++) System.out.print(newarr[i]+"  ");
    }
}