package Iterator;

import java.util.*;
public class Main{

    static Iterator<?> func(ArrayList<?> myList){
        var it = myList.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String && element.equals("###"))

                break;
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        var myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            myList.add(sc.nextInt());
        }

        myList.add("###");
        for(int i=0;i<m;i++){
            myList.add(sc.next());
        }

        var it=func(myList);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
