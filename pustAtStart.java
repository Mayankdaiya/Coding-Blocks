import java.util.*;

class pustAtStart{
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        Insert(s,-2);
        System.out.println(s);

    }

  public static void Insert(Stack<Integer> s,int item){
        if(s.isEmpty()){
            s.push(item);
        }
        else{
            int t=s.pop();
            Insert(s,item);
            s.push(t);
            return;
        }
    }
}