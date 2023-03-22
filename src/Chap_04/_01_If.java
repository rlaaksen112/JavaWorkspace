package Chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 10;  // 오전10시
        if (hour < 14){
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("커피 주문 완료");
        }else {
            System.out.println("커피 과다복용");
        }

        // 오후 2시 이전 모닝 커피를 마시지 않은 경우?
        boolean morningCoffee = true;
        if (hour < 14 && morningCoffee == false){
            System.out.println("커피를 마셔도 된다");
        } else {
            System.out.println("커피 과다 복용");
        }
    }
}
