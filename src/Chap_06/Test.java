package Chap_06;

public class Test {
    public static String getHiddenDate(String date, int index){
        String hiddenDate = date.substring(0, index);   // 나코딩 = > 나
        for (int i = 0; i < date.length() - index; i++) {
            hiddenDate += "*";
        }
        return hiddenDate;
    }



    public static void main(String[] args) {
        // 개인정보를 비공개로 전환하는 메소드 작성
        // 하나의 메소드에서 모든 동작 처리
        // 각 정보는 아래 위치로부터 비공개 적용
        // 이름 : 2번째 글자부터
        // 주민등록번호 : 9번째 글자부터
        // 전화번호 : 10번째 글자부터

        String name = "나코딩";          // 이름
        String id = "960508-1120217";   // 주민번호
        String phone = "010-7287-4029"; // 전화번호

        System.out.println(getHiddenDate(name,1));
        System.out.println(getHiddenDate(id,8));
        System.out.println(getHiddenDate(phone,9));
    }
}
