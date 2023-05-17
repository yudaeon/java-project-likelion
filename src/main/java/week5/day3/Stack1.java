package week5.day3;

import java.util.Arrays;

public class Stack1 {
    private int[]arr = new int[10000];
    private int pointer = 0;

    public void  push(int value) {
        this.arr[pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.println("pointer = " + pointer);
    }


    public int pop(){
        int temp = this.arr[pointer - 1];
        pointer--;
        return temp;
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        st.push(20);
        System.out.println(st.pop()); //20 LIFO
        System.out.println(st.pop()); //10 LIFO

    }
        }