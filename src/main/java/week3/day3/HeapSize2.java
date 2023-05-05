package week3.day3;

import java.util.Stack;

public class HeapSize2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < Integer. MAX_VALUE; i++){
            st.push(i);
            System.out.println(i);
        }
    }
}
