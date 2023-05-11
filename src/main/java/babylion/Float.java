package babylion;

public class Float {
    public static void main(String[] args) {


        //실수
        //Float 6~7 정확한 값을 어디까지 보장하냐?
        //double15~16
        //소수점 이하 7자리 아니고 -> 유효자릿수가 7 ( 유효숫자 갯수가 7, 0을 제외한 것)
        float f1 = 10.11111111f;
        float f2 = 10.22222222f;
        System.out.println(f1 + f2); //20.333332 총 7자리로 출력(소수점 이하 7자리가 아님)


    }
}