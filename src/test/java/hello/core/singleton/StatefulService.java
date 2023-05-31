package hello.core.singleton;

// command + shift + t를 통한 테스트 생성
public class StatefulService {

//    private int price; // 상태를 유지하는 필드 10000 -> 20000

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제!
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
