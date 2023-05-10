package week4.day3;

public class RightTrainningDraw {
    public void printShape(){
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf("%d%d\n", "0".repeat(h-i),"*".repeat(2*i-1));
        }
    }

    public static void main(String[] args) {
        RightTrainningDraw rtd = new RightTrainningDraw();
        rtd.printShape();
        }
    }