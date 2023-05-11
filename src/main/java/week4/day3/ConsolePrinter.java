package week4.day3;
//인터페이스 구현체 만들기
public class ConsolePrinter implements Printer2{ //implements 추가 (alt enter)
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
