package Chap_04;

public class _02_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if else문을 활용
        int ranking = 3;    // 등수
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 케이스 2와 3을 통합
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 상품의 등급에 따른 가격 책정 (1급 : 8000원, 2급 : 7000원, 3급 : 6000원, 그외 5000원)
        int grade = 88;
        int price = 5000;
        switch (grade){
            case 1 :
                price += 3000;
                System.out.println("이 제품의 가격은 " + price + "원 입니다.");
                break;
            case 2 :
                price += 2000;
                System.out.println("이 제품의 가격은 " + price + "원 입니다.");
                break;
            case 3 :
                price += 1000;
                System.out.println("이 제품의 가격은 " + price + "원 입니다.");
                break;
            default:
                System.out.println("이 제품의 가격은 " + price + "원 입니다.");
        }
    }
}
