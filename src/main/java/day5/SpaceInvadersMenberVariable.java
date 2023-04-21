package day5;

public class SpaceInvadersMenberVariable {
    int location; //클래스의 멤버라는 걸 선언
      public void moveLeft(){
          location = location -1;
          System.out.printf("moveLeft: %d\n", location);
      }
      public void moveRight(){
        location = location +1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMenberVariable simv = new
                SpaceInvadersMenberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

    }
    }