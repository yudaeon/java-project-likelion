package week4.day2;
      //리팩토링 1번
    //생성자 붙이기 (생성자를 붙여야지 켜고 끌 수 있다)
import java.util.Scanner;

public class ReversePyramid {
    private String spaceChar = "0";

public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
        // 역피라미드 만들기
        //1.메소드로 분리
        }
    public String makeAline(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h + 4 +(-i * 2)));
    }
    //makeAline분리
    public String makeParallelogramAline(int h, int i){
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = sc.nextInt();
        for (int i = 0; i < h; i++) {
        //2.기존로직 메소드 호출 하게 변경
            System.out.print(reversePyramid.makeAline(h,i));
        }
    }
}
