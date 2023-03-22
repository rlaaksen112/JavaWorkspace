package Chap_04;

public class _05_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile

        int distance = 25;  // 전체 거리
        int move = 0;       // 현재 이동 거리
        int height = 2;     // 키
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 " + move + "m 입니다.");
            move += 3;
        }
        System.out.println("도착 완료");
        System.out.println("-------------------------");

        //키가 엄청나게 큰사람?
        move = 0;
        height = 25;
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 " + move + "m 입니다.");
            move += 3;
        }
        System.out.println("도착 완료");
        System.out.println("-------------------------");

        // Do While
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 " + move + "m 입니다.");
            move += 3;
        } while (move + height < distance);
        System.out.println("도착 완료");
    }
}
