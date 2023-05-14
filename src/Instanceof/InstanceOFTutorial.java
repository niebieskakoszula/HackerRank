package Instanceof;

import java.util.*;


class Student{}
class Rockstar{}
class Hacker{}


public class InstanceOFTutorial{

    static String count(ArrayList myList){
        int a = 0,b = 0,c = 0;
        for (Object element : myList) {
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        return a +" "+ b +" "+ c;
    }

    public static void main(String []args){
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))myList.add(new Student());
            if(s.equals("Rockstar"))myList.add(new Rockstar());
            if(s.equals("Hacker"))myList.add(new Hacker());
        }
        System.out.println(count(myList));
    }
}
