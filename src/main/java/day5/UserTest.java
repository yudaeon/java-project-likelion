package day5;

public class UserTest {
    public static void main(String[] args) {
        //첫번째 유저 yudaeon -> 이름, 전화번호, 나이 순서대로 선언
        User yudaeon = new User();
        yudaeon.name = "유다언";
        yudaeon.phoneNumber = "010-1111-2222";
        yudaeon.age = 26;

    //첫번째 유저 wondu -> 이름, 전화번호, 나이 순서대로 선언
        User wondu = new User();
        wondu.name = "원두";
        wondu.phoneNumber = "010-0000-2222";
        wondu.age = 3;


        System.out.printf("%s님은 성인입니까? %s\n",yudaeon.name, yudaeon.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", wondu.name, wondu.isAdult());

    }
}
