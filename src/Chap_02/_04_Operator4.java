package Chap_02;
// 논리 연산자
public class _04_Operator4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        // Or 연산
        System.out.println(a || b || c);    // true || 하나라도 true 라면 true
        System.out.println((4 > 2) || (1 > 3)); // true
        // And 연산
        System.out.println(a && b && c);    // flase && 모두 만족할때
        System.out.println(a && c);         // true
        System.out.println((4 > 2) && (7 > 3)); // true
        System.out.println((4 > 2) && (1 > 3)); // false

        System.out.println(1 < 3 && 3 < 5);   // System.out.println(1 < 3 < 5); == 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!true);     // false
        System.out.println(!false);    // true
        System.out.println(!(5 == 2)); // true
        System.out.println(!(5 > 3));  // false
    }
}
