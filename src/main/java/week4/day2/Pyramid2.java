package week4.day2;

public class Pyramid2 {
    private String spaceChar = "0";

    public Pyramid2(String spaceChar){
        this.spaceChar = spaceChar;
    }
    //기능이 3가지 > 하나의 메소드는 한기능만 가지는게 좋음
  public void printPyramid(int height) {
      for (int i = 0; i < height; i++) {
          System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1) ,"*".repeat(2 * i + 1) );
      }
  }
    //메소드 분리
    public String makeALine(String spaceChar, int height, int i){
        return String.format("%s%s\n", spaceChar.repeat(height-i-1), "*".repeat(2 * i -1));
    }

    public void printPyramidWithSpaceChar (int height, String spaceChar){
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(spaceChar, height, i));
        }
    }

    public static void main(String[] args) {
            Pyramid2 pyramid2 = new Pyramid2(" ");
            Pyramid2 pyramidSpaceZero = new Pyramid2("0");
            pyramid2.printPyramid( 4);
            pyramidSpaceZero.printPyramid(5);
        }
    }
