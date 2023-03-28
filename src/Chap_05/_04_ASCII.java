package Chap_05;
    //  아스키 코드
public class _04_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 안시라고하는 미국 표준협회에서 제안한 미국 표준 코드
        // 알파벳 대문자 A 는 65부터 시작, 소문자 a 는 97 부터 시작
        char c = 'A';
        System.out.println(c);      // A
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c);      // B
        System.out.println((int)c); // 66

        c++;    // 66에 1을 더해서 67의 문자가 나왔음.
        System.out.println(c);      // C
        System.out.println((int)c); // 67

    }
}
