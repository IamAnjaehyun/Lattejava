package com.example.iterator;
//Collection 소속
//Iterator 은 hasnext와 next,remove를 갖고있음
import java.util.HashSet;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        //반복문 사용할때 쓰는 for(int i=0---) 에서 i와 같은 역할
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            //next()라는 메소드는 들어있는 메소드중 하나를 리턴함 그리고 1이라는 값은 사라짐
            // hi라는 집합 안의 값이 사라지는것 뿐 A안에 있는 123은 안사라짐
            // = 오리지널 값은 안사라짐
            System.out.println(hi.next());
        }
    }
}
