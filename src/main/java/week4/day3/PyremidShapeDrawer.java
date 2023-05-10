package week4.day3;

public class PyremidShapeDrawer extends ShapeDrawer2 { //부모 shapeDrawer2의 자식
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2*i-1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 sd = new PyremidShapeDrawer();
        sd.printShape(5);
    }
}
