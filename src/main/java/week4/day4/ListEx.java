package week4.day4;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello"); //0번
        l1.add("1");  //1번
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size()); //리스트에 사이즈
        System.out.println(l1.isEmpty()); //리스트에 값이 비어있는지
       // l1.remove(0); //인덱스의 0번 삭제
      //  l1.remove(0); //인덱스의 0번 삭제
        System.out.println(l1.isEmpty());

        System.out.println("----------");
        for (var item  : l1){ //==for each
            System.out.println(item);
        }

        int[] arr = new int [3];
        arr[0] = 1;
        arr[0] = 0;

    }
}
