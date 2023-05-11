package week4.day3;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Scanner;

public class DrawDiamond2 {
    public static String getRepeatSymbol(String symbol, int n){
        return symbol.repeat(n);
    }

//    public static String getRepeatSymbolFor(String symbol, int n){
//        String answer = "";
//        for (int i = 0; i < n; i++) {
//            answer += symbol;
//        }
//        return answer;
//    }

    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
         return String.format("%s%s\n", getRepeatSymbol("0", pivot - i), getRepeatSymbol("*", 2 * i + 1));
        } else {
          return String.format("%s%s\n", getRepeatSymbol(" ", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h = 7;
        DrawDiamond drawDiamond = new DrawDiamond();
        for (int i = 0; i < h; i++) {
      //      System.out.print(makeALine(h, i));
        }
    }
}
