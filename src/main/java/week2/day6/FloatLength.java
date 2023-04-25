package week2.day6;

public class FloatLength {
    public static void main(String[] args) {
        float f1 = 3.141592f;
        double d1 = 3.141592653589793555; //소수점은 15자리까지, 0부터 시작하니까 뒤에 555는 반올림 되어 6으로 끝남
        System.out.println(f1);
        System.out.println(d1);
        System.out.println("1" + 1);
        String result = 1 + "1";
        System.out.println(result);

        int iResult = 1 + Integer.parseInt("1");
        System.out.println(iResult);
    }
}
