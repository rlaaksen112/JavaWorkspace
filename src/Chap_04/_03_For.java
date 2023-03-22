package Chap_04;

public class _03_For {
    public static void main(String[] args) {
        // 반복문
        /*for (선언; 조건; 증감){

        }*/

        for (int i = 0; i < 10; i++){
            System.out.println("어서오세요 환영합니다" + i);
        }

        // 짝수만 출력
        for (int i = 0; i < 11; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        for(int i = 0; i < 11; i += 2){
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        // 홀수만 출력
        for (int i = 0; i < 11; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        System.out.println("-----------------------------");

        // 1부터 10까지 수들의 합
        int b = 0;
        for (int i = 1; i < 11; i++) {
            b = b + i;
            if (i == 10){
                System.out.println("1부터 10까지의 합은 " + b + "입니다.");
            }
        }
    }
}
