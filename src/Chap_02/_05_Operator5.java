package Chap_02;
//삼항 연산자
public class _05_Operator5 {
    public static void main(String[] args) {
        // 결과 = (조건) ? (참의 경우의 결과값) : (거짓의 경우 결과값)
        // 조건의 값이 참의 경우 참의 결과값, 거짓의 경우 거짓의 결과값이 들어감
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);    // 5

        x = 3;
        y = 7;
        int max_2 = (x > y) ? x : y;
        System.out.println(max_2);  // 7

        int min = (x < y) ? x : y;
        System.out.println(min);    // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b);      // false

        String c = (x != y) ? "달라요" : "같아요";
        System.out.println(c);      // 달라요
    }
}
