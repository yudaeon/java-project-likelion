package week4.day3;

public class RightTriangleDraw {
    public String makeALine(int h , int i){
        return String.format("%d%d\n","0".repeat(h-i),"*".repeat(2*i-1));
    }
    public void printShape(int height){
        int h = 5;
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height,i));
        }
    }

    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw();
        rtd.printShape(5);
        }
    }