package Chap_07.Camera;

public class SpeedCam extends Camera {     // 자식 클래스
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed(){
        System.out.println("속도를 측정 합니다.");
    }

    public void recognizeLicensePlate(){
        //  번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }


}
