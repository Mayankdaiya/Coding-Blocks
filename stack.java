
public class stack {
    private static class Stack{
        int arr[];
        int top=-1;
        Stack(){
            arr=new int[5];
        }
        Stack(int len){
            arr=new int[len];
        }
        public void push(int item) throws Exception{
            if(isFull()){
                throw new Exception("Stack full");
            }
            arr[++top]=item;
        }

        public void pop() throws Exception{
            if(isEmpty()){
                throw new Exception("Stack Empty");
            }
            int t=arr[top];
            top--;
        }
        public int peek() throws Exception{
            if(isEmpty()){
                throw new Exception("Stack Empty");
            }
            return arr[top];
        }
        public boolean isEmpty(){
            return top==-1;
        }
        public boolean isFull(){
            return top==arr.length-1;
        }
        public int Size(){
            return top+1;
        }
        public void display(){
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.pop();
        System.out.println();
        s.display();
        System.out.println("\n"+s.Size());
    }
}
