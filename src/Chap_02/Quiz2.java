package Chap_02;

public class Quiz2 {
    /*퀴즈2
    어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는
    프로그램을 작성 하시오
    조건
    - 키가 120cm 이상인 경우에만 탑승 가능
    - 삼항 연산자 사용
    실행 결과
    - 키가 115cm 이므로 탑승 불가능 합니다.
    - 키가 121cm 이므로 탑승 가능 합니다.*/
    public static void main(String[] args) {
        //키
        int height = 115;
        int standard = 120;
        String result = (height >= standard) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " +result+ " 합니다.");
        height = 121;
        result = (height >= standard) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " +result+ " 합니다.");
    }
}
