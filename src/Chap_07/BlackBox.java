package Chap_07;

public class BlackBox {
    String modelName;       // 모델명  (인스턴스 변수)
    String resolution;      // 해상도  (인스턴스 변수)
    int price;              // 가격   (인스턴스 변수)
    String color;           // 색상   (인스턴스 변수)
    int serialNumber;       // 시리얼 번호 (인스턴스 변수)
    static boolean conAutoReport = false;   // 자동 신고 기능 (스태틱 변수)
    static int counter = 0; // 시리얼 번호를 생성해주는 역할

    //----생성자----   객체가 생성될때 자동으로 호출되는 메서드
    BlackBox(){
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 번호를 발급 받았 습니다.");
    }

//    BlackBox(String modelName, String resolution, int price, String color){
//        this();
//
//        System.out.println("사용자 정의 생성자");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
//    }

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

    void appendModelName(String modelName) {
        this.modelName += modelName;    // this가 붙은 modelname는 인스턴스 변수를 바로 지칭해주고 붙지않은것은 파라미터의 modelname이다.
    }

    //  Getter Setter
    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    int getPrice(int price){
        return price;
    }

    void setPrice(int price){
        if(price < 100000){
            this.price = 100000;
        }else {
            this.price = price;
        }
    }
}
