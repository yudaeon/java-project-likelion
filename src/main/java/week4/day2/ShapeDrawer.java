package week4.day2;

public abstract class ShapeDrawer { //abstract붙여서 추상 클래스 만들기
//abstract class 추상 클래스 구현
    public void printPyramid(int height){
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    public abstract String makeALine (int height, int i) ; //추상클래스 구현하기
    }
