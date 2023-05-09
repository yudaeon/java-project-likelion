package week4.day2;

public class MultiplicationTable{//구구단 출력
    private String multipleSymbol;

    public MultiplicationTable(String multipleSymbol){
        this.multipleSymbol= multipleSymbol;
    }//private 멤버 변수 선언

    public  void printDan(int dan){
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol,i, dan * i);
        }
        System.out.println("------------------");
}
    public static void main(String[] args) {
        //2단 5단 7단 8단
        MultiplicationTable mt = new MultiplicationTable("x");
        mt.printDan(2);
        mt.printDan(5);
        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printDan(7);
        mt2.printDan(8);
    }
}
