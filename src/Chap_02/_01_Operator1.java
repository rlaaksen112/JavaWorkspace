package Chap_02;
public class _01_Operator1 {
        public static void main(String[] args) {
            // 산술 연산자

            // 일반 연산
            System.out.println(4 + 2);  // 6
            System.out.println(4 - 2);  // 2
            System.out.println(4 * 2);  // 8
            System.out.println(4 / 2);  // 2
            System.out.println(5 / 2);  // 2
            System.out.println(2 / 4);  // 0
            System.out.println(4 % 2);  // 0 % == > 나머지값
            System.out.println(5 % 2);  // 1

            // 우선 순위 연산
            System.out.println(2 + 2 * 2);   // 6
            System.out.println((2 + 2) * 2); // 8

            // 변수를 이용한 연산
            int a = 20;
            int b = 10;
            int c;
            c = a + b;
            System.out.println(c);  // 30
            c = a - b;
            System.out.println(c);  // 10
            c = a * b;
            System.out.println(c);  // 200
            c = a / b;
            System.out.println(c);  // 2
            c = a % b;
            System.out.println(c);  // 0

            // 증감 연산 ++, --
            int val;
            val = 10;
            System.out.println(val);    // 10
            System.out.println(++val);  // 11
            System.out.println(val);    // 11

            val = 10;
            System.out.println(val);    // 10
            System.out.println(val++);  // 10
            System.out.println(val);    // 11
            // ++ 이 앞에 오면 문장을 실행 하기 전에 먼저 1을 더해주고 문장을 실행
            // ++ 이 뒤에 오면 문장을 실행 후에 1을 더해 준다

            val = 10;
            System.out.println(val);    // 10
            System.out.println(--val);  // 9
            System.out.println(val);    // 9

            val = 10;
            System.out.println(val);    // 10
            System.out.println(val--);  // 10
            System.out.println(val);    // 9

            // (예시)은행 대기번호 표 뽑기
            int waiting = 0;
            System.out.println("현재 대기 인원은 " + waiting++ + "명 입니다.");    // 대기 인원 : 0명
            System.out.println("현재 대기 인원은 " + waiting++ + "명 입니다.");    // 대기 인원 : 1명
            System.out.println("현재 대기 인원은 " + waiting++ + "명 입니다.");    // 대기 인원 : 2명
            System.out.println("현재 대기 인원은 " + waiting++ + "명 입니다.");    // 대기 인원 : 3명
        }
}
