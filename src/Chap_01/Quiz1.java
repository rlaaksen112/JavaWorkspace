package Chap_01;

public class Quiz1 {
    public static void main(String[] args) {
    /*  퀴즈1
        버스 도착 정보를 출력하는 프로그램을 작성하시오
        각 정보는 적절한 자료형의 변수에 정의합니다
        정보
        - 버스 번호는 "1234", "상암08" 과 같은 형태
        - 남은 시간은 분 단위 (예: 3분, 5분)
        - 남은 거리는 km 단위 (예: 1.5km, 0.8km)  */

        // 버스 번호
        String bus_1 = "1234";
        String bus_2 = "상암08";

        // 남은 시간
        int minute_1 = 3;
        int minute_2 = 5;

        // 남은 거리
        double distance_1 = 0.8;
        double distance_2 = 1.5;

        System.out.println(bus_1 + "번 버스");
        System.out.println("도착 "+ minute_1 + "분 전");
        System.out.println("남은 거리 " + distance_1 + "km 입니다.");

        System.out.println(bus_2 + "번 버스");
        System.out.println("도착 "+ minute_2 + "분 전");
        System.out.println("남은 거리 " + distance_2 + "km 입니다.");
    }
}
