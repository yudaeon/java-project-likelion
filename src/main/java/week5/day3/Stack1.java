package week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {
    private int[]arr = new int[10000];
    private int pointer = 0;
        //push
    public void push(int value) {
        arr[pointer++] = value;
       // System.out.println(Arrays.toString(arr));
       // System.out.println("pointer = " + pointer);
    }
    //isEmpty
    public boolean isEmpty(){
        return pointer == 0;
    }

    //pop
    public int pop(){
        if (isEmpty()) throw  new RuntimeException("스택이 비었습니다.");
        return arr[--pointer];
    }

    //peek
    public int peek(){
        if (isEmpty()) throw new EmptyStackException();
        return arr[pointer-1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.pop()); //10
        st.push(20);
        System.out.println(st.peek()); //20

//        System.out.println(st.isEmpty()); //비었니? true
//        System.out.println(st.pop());
//        System.out.println(st.isEmpty()); //비었니? false
//        System.out.println(st.peek());
    }
        }