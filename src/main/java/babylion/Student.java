package babylion;
//1.접근제한자 - public, private, default, protected
//2.리턴값 - 메소드 반환 타입(자료형) - 원시타입, 참조타입
//3.메소드명 - 메소드의 이름(기능을 유추할 수 있게끔 네이밍하면됨)

public class Student {
    int age;

    private boolean 쇼츠() {
        return true;
    }

    private boolean 게임() {
        return true;
    }

    public void study(int i) {
        쇼츠();
        게임();
        if (쇼츠() && 게임()) {
            System.out.println(i + "시간 공부함!");
        }
    }
}