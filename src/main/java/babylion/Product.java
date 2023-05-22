package babylion;

public abstract class Product {
    // 추상화 일반클래스,추상클래스,인터페이스
    //추상클래스는 객체 생성이 불가능하다.
    //추상클래스는 자식클래스에게 추상메서드 구현을 강제한다.
    int price;
    Boolean power;
    public Product(int price){
        this.price = price;
    }

    public void power() {
        this.power = !power;
    }
        abstract void print();

    public String toString(){
        return "Product{ " +
                "price=" + price+
                ", power = " + power;
        }
    }