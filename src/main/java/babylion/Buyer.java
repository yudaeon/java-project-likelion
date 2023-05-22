package babylion;

import java.util.ArrayList;
import java.util.List;

//public class Buyer {
//    public boolean cartLists;
//    //캡슐화란
//    //객체의 내부 구조 및 데이터를 캡슐처럼 감싸 외부에서 직접 볼 수 없게 은닉하거나 보호하는 것
//    //어떻게 은닉하고 보호하는데? 클래스 내부에 변수, 메소드 만들면 됨, 접근제어자를 지정하면 된다.
//    private int money = 10000;
//    //상품이 들어있는 카트 배열 만들기
//    //computer[], tv[]
//    Product[] carts = new Product[5];
//    final List<Product> cartList = new ArrayList<>();
//
//    int i = 0;
//    private Product product;
//
//    //getter&setter
//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        if (money > 0){
//            this.money = money;
//        }
//    }
//
//    public void buy(Product pTV) {
//        if (money >= Product.price){
//            money -= Product.price;
//           // carts[i++] = product;
//            cartList.add(product);
//        }
//            System.out.println(money);
//    }
//}