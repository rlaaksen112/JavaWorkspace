package Chap_04;

public class _07_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중 노쇼 손님 있다고 가정
        // For
        int max = 20;   // 최대 판매 수량
        int sold = 0;   // 현재 판매 수량
        int noShow = 17;// 대기번호 17번 노쇼 손님
        for (int i = 1; i < 50; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");

            // 노쇼 고객 발생
            if (i == noShow){
                System.out.println(i + "번 손님 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++; //판매 처리

            if (sold == max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료 합니다.");
    }
}
