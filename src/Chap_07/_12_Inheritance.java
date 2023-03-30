package Chap_07;

import Chap_07.Camera.Camera;
import Chap_07.Camera.FactoryCam;
import Chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        //  상속
//      Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

//      System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

//      camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();
    }
}
