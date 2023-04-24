package week1.day4;

public class VariableEx {
    public static void main(String[] args) {
        int ival;
        ival = 0; //최초로 값을 지정하는 것 = 초기화

        PrintHello printHello; //변수타입 변수명; ->변수선언
        printHello = new PrintHello(); //new를 이용해 인스턴스화 및 초기화

        System.out.println(ival);
        printHello.print();
    }
}
