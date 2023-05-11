package week4.day3;

public class DrawDiamond {
    //다이아몬드 별찍기(피라미드&역피라미드 붙이기)
    public static String getRepeatedSymbol(String symbol, int n){
     return symbol.repeat(n);
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < 7; i++) {

            if (i <= pivot) {
                //피라미드 로직
                //초항이 3 등차가 -2
                System.out.printf("%s%s\n", getRepeatedSymbol(" ",pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            }else{
                //역피라미드 로직
                System.out.printf("%s%s\n", getRepeatedSymbol(" ",i - pivot), getRepeatedSymbol("*", 2*(h-i) - 1));
            }
        }
    }
}
