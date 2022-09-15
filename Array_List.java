import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        //remove
        list.remove(2);
        //add at any index
        list.add(2,-11);
        //get
        list.get(1);
        //update
        System.out.println(list.set(1,-90));
        //sort
        Collections.sort(list);
        //print in list format
        System.out.println(list);
        //print in array format using for each loop
        for(int k:list){
            System.out.println(k);
        }
    }
}
