package day5;

public class SpaceInvaer {
    private void moveLeft() {
        int location = 0;
        location = location -1;
        System.out.printf("moveLeft:, %d\n", location);
    }
    private void moveRight() {
        int location = 0;
        location = location + 1;
        System.out.printf("moveRight:, %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaer si = new SpaceInvaer();
        si.moveLeft();
        si.moveRight();
    }
}
