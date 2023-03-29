package Chap_07;

public class BlackBox {
    String modelName;       // 모델명  (인스턴스 변수)
    String resolution;      // 해상도  (인스턴스 변수)
    int price;              // 가격   (인스턴스 변수)
    String color;           // 색상   (인스턴스 변수)
    static boolean conAutoReport = false;   // 자동 신고 기능 (스태틱 변수)

    void autoReport() {
        if(conAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고 합니다.");
        }else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입 되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다");
    }

    int getVideoFileCount(int type){
        if(type == 1){
            return 9;
        }else if(type == 2) {
            return 55;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작 합니다.");

        if(showDateTime){
            System.out.println("영상에 날짜 정보가 표시 됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도 정보가 표시 됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록 됩니다.");
    }

    void record(){
        record(true,true,5);
    }

    static void callServiceCenter(){        // (스태틱 메서드)
        System.out.println("서비스 센터 010-7287-4029로 연결 합니다.");
    }

}
