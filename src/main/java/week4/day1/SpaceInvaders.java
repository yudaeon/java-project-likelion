package week4.day1;

public class SpaceInvaders {
    int location; //멤버 변수 선언
    public void moveLeft(){ //왼쪽으로 이동하는 메소드
        location = location - 1;//기존값에-1
    }
    public void moveRight(){//오른쪽으로 이동하는 메소드
        location = location + 1;//기존값에 +1
    }
}
