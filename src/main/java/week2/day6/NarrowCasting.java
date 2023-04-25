package week2.day6;

public class NarrowCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        int ival = (int) dVal;
        //double 타입인 d를 int 타입으로 강제 형 변환
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + ival);
    }
}
