package Chap_01;

public class _05_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score);  // 93
        System.out.println((float)score);  // 93.0 실수형으로 형 변환
        System.out.println((double)score); // 93.0 실수형으로 형 변환

        // float , double to int
        float score_f = 93.1F;  // int로 인식 하기 때문에 뒤에 소문자or대문자 f 적어주기.
        double score_d = 98.3;
        System.out.println((int)score_f);   // 93 정수형으로 형 변환
        System.out.println((int)score_d);   // 98 정수형으로 형 변환

        // 정수 + 실수 연산
        score = 93 + (int)93.8; // 93.8을 정수형으로 바꿈으로 score가 계산할수있음
        System.out.println(score);
        score_f = 151 + 151.4F; // 302.4 실수이기에 변환 따로 필요 x
        score_d = 167 + 167.4;  // 334.4 실수이기에 변환 따로 필요 x
        System.out.println(score_f);
        System.out.println(score_d);

        // 변수에 형변한된 데이터 집어넣기
        int a = 33;
        double convertedScoreDouble = a; // 33 => 33.0 형변환으로 들어감.
        System.out.println(convertedScoreDouble);   // 33.0
        // int => long => float => double 점점 커지는 범위로 갈때 자동형변환이 된다 (자동 형변환)

        int convertedScoreInt = (int)score_d;   // 334.4 => 334 큰 범위의 데이터에서 작은 범위의 데이터로 담았기 때문에 소수점 이하가 짤려서 들어감.
        // double => float => long => int 작은 범위로 옮겨갈때는 앞에 변환시키려는 수동으로 적어 주어야 한다 (수동 형변환)

        // 정수를 문자로
        String s1 = String.valueOf(93); // 문자열로 93을 바꿈 <방법1>
        System.out.println(s1); // 93
        s1 = Integer.toString(97);  // 문자열로 97을 빠꿈  <방법2>
        System.out.println(s1); // 97
        System.out.println(String.valueOf(score));

        // 실수를 문자로
        String s2 = String.valueOf(98.8); //  <방법1>
        System.out.println(s2);
        s2 = Double.toString(111.2);    //<방법2>
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);  // 93
        double d = Double.parseDouble("93.8");
        System.out.println(d);  // 93.8

        // int error = Integer.parseInt("문자"); == > 문자열을 숫자로 바꿀때는 ""사이의 데이터가 올바로 들어가 있어야 한다.
    }
}
