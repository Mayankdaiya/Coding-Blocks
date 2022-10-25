import java.util.Scanner;
class Main{
    public static int Count_No_Of_SplitPoss(int[] arr,int st,int en){
        int len=en-st+1;
        int s=0;
        int c=0;
        if(Sum(arr,0,arr.length-1)==0 && st==0 && en==arr.length-1) return arr.length-1;
        if(len==0) return 0;
        for(int i=0;i<len;i++){
            if(Sum(arr,st,st+i)!=Sum(arr,st+i+1,en)) continue;
            else{
                c+=1;
                return c+Math.max(Count_No_Of_SplitPoss(arr,st,st+i),Count_No_Of_SplitPoss(arr,st+i+1,en));
            }
        }
        return c;
    }

    public static int Sum(int[] arr,int st,int en){
        int s=0;
        for(int j=st;j<=en;j++) s+=arr[j];
        return s;
    }

    public static void main(String[] args){
        Scanner ssc=new Scanner(System.in);
        int num=ssc.nextInt();
        while(num-->0){
            int Arr_Size=ssc.nextInt();
            int[] arr=new int[Arr_Size];
            for(int j=0;j<Arr_Size;j++) arr[j]=ssc.nextInt();
            System.out.println(Count_No_Of_SplitPoss(arr,0,Arr_Size-1));
        }
    }
}	