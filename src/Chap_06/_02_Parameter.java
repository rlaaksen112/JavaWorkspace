package Chap_06;

public class _02_Parameter {
    //  전달값이 있는 메소드
    public static void power(int number){   // 이때의 int number를 파라미터 즉 매개변수(전달값) 이라고 한다.
        int result = number * number;
        System.out.println(number + " 의 2승은 " + result + "입니다.");
    }

    public static void main(String[] args) {
        power(22);
        power(2212121);
        power(222323);
        power(222324524);

    }

}
