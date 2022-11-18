import java.util.Scanner;

class printSpiral{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int len=arr.length;
        // int m=1, n=1;
        for(int j=0;j<4;j++){
            System.out.println(arr[i][j]);
            if(j==len-1){
                i++;
                j--;
            }
            if(i==len){
                j-=2;
            }
        }
    }
}
