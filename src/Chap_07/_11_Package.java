package Chap_07;

import java.util.Random;    // 자바.유틸 이라는 패키지 내에서 제공되는 랜덤 클래스를 사용 하겠다.

public class _11_Package {
    public static void main(String[] args) {
        //  패키지 (랜덤 클래스)
        Random random = new Random();

        System.out.println(random.nextInt());   // int 범위 내에서 정수형 값 반환
        System.out.println(random.nextInt(10)); // 0 이상 10 미만의 정수형 값 반환
        System.out.println(random.nextDouble());    // 0.0 이상 1.0 미만의 실수 값 반환

        //System.out.println(random.nextDouble(10.0));  실수는 사용 할 수 없음 다른 트릭으로 사용해야함
        double min = 5.0;
        double max = 10.0;
        System.out.println((min + (max - min) * random.nextDouble()));  // 5.0 이상 10.0 미만

        System.out.println(random.nextBoolean());

        // 로또 번호 랜덤으로 뽑기 1~45
        System.out.println((1 + random.nextInt(45)));   // random.nextInt(45) == 0~44인데 +1 을 해주면 최소값 최대값이 1~45로 바뀜
    }
}
