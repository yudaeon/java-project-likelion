package week4;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        //메소드 호출 할 때 new를 해야지만 호출된다.
        si.moveLeft(); //-1
        System.out.println(si.location);
        si.moveLeft(); //-2
        System.out.println(si.location);
        si.moveRight(); //-1
        System.out.println(si.location);
        si.moveRight();//0
        System.out.println(si.location);
        si.moveRight();//1
        System.out.println(si.location);
    }
}
