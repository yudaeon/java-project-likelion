package week5.day3;

import java.util.Arrays;

public class Stack1 {
    private int[]arr = new int[10000];
    private int pointer = 0;
        //push
    public void push(int value) {
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer = " + pointer);
    }
        //pop
    public int pop(){
        return this.arr[--pointer];
    }
        //isEmpty
    public boolean isEmpty(){
        return this.pointer == 0;
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();

        System.out.println(st.isEmpty()); //비었니? true
        st.push(10);
        System.out.println(st.isEmpty()); //비었니? false
        st.pop();
        System.out.println(st.isEmpty()); //false
        st.pop();
    }
        }