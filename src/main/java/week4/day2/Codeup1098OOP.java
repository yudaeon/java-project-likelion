package week4.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Codeup1098OOP {
    private int[][] arr; //파라미터
    private boolean printSeparator;

    public Codeup1098OOP(){
        this.arr = new int[5][5];
        this.printSeparator = true;
    }
    public Codeup1098OOP(boolean printSeparator){
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }
    public Codeup1098OOP(int rowCnt){
        this.arr = new int[rowCnt][5];
    }

    public Codeup1098OOP(int rowCnt, int colCnt){
        this.arr = new int[rowCnt][colCnt];
        }

    public void setBeam(int l, int direction, int x, int y){
            for (int i = 0; i < l; i++) {
                if (direction == 0){
                    arr[x-1][y+i-1] = 1;
                } else {
                    arr[x+i-1][y-1] = 1;
                }
            }
    }
public void printArr(){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]));
    }
    if (this.printSeparator) System.out.println("---------");
}

    public static void main(String[] args) {
        Codeup1098OOP c1098 = new Codeup1098OOP(false);
        c1098.printArr();
        c1098.setBeam(2,0,1,1);
        c1098.printArr();
        c1098.setBeam(3,1,2,3);
        c1098.printArr();
        c1098.setBeam(4,1,2,5);
    }
}
