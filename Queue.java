public class Queue {
    private static class queue{
        private int arr[];
        private int front=0, size=0;
        queue(){
            arr=new int[5];
        }
        queue(int len){
            arr=new int[len];
        }
        
        public void enqueue(int item) throws Exception{
            if(isFull()){
                throw new Exception("Queue full");
            }
            int idx=(front+size)%arr.length;
            arr[idx]=item;
            size++;
        }

        public void dequeue() throws Exception{
            if(isEmpty()){
                throw new Exception("Queue Empty");
            }
            front=(front+1)%arr.length;
            size--;
        }

        public int getFront() throws Exception{
            if(isEmpty()){
                throw new Exception("Queue Empty");
            }
            return arr[front];
        }

        public boolean isEmpty(){
            return size==0;
        }
        public boolean isFull(){
            return size==arr.length;
        }
        public int Size(){
            return size;
        }
        public void display(){
            for(int i=front;i<=size;i++){
                System.out.print(arr[i%arr.length]+" ");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        queue q=new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.enqueue(10);
        q.display();
        System.out.println("\n"+q.getFront());

    }
}
