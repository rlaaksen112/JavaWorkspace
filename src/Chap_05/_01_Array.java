package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //  배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        String coffeeRose = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRose + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

        //  선언 첫번째 방법
        String[] coffees = new String[4];

        //  선언 두번째 방법
        String coffees1[] = new String[4];

        //  인덱스값을 정의해서 값을 넣어 줄수 있음 , 인덱스 값은 항상 0부터 시작함
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        //  선언 세번쨰 방법 이 방법으로 값을 미리 넣을때에는 인덱스값을 new String[4] 라고 따로 표기 하지 않는다.
        String[] coffees2 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //  선언 네번째 방법
        String[] coffees3 = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println(coffees[0] + " 주세요");
        System.out.println(coffees[1] + " 주세요");
        System.out.println(coffees[2] + " 주세요");
        System.out.println(coffees[3] + " 주세요");

        //  배열 값 바꾸기
        coffees[1] = "에스프레소";
        System.out.println(coffees[1]);

        //  다른 자료형
        int[] i = new int[4];
        i[0] = 111;

        double[] d = new double[] {12.3 , 121.2};

        boolean[] a = {true , false , true};

    }
}
