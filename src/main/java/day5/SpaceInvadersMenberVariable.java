package day5;

public class SpaceInvadersMenberVariable {
    int location; //멤버변수
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

        System.out.printf("최종 위치: %d\n", simv.location);
        //변수명.멤버변수이름
        simv.moveLeft();
        System.out.printf("최종 위치: %d\n", simv.location);
    }
    }