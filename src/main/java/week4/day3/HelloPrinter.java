package week4.day3;

public class HelloPrinter {
    // 파일에도 저장 하고 싶고
    // 콘솔에도 출력 하고 싶다.
    public void print(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.print("Hello");
        hp.print("Bye");
    }
}
