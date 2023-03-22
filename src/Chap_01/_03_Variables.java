package Chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        //변수
        System.out.println("나도 코딩님, 배송이 시작됩니다. 15시 방문 예정 입니다.");
        System.out.println("나도 코딩님, 배송이 완료 되었습니다.");

        String name = "나도 코딩"; // 문자열
        System.out.println(name +"님, 배송이 시작됩니다. 15시 방문 예정 입니다.");
        System.out.println(name +"님, 배송이 완료 되었습니다.");

        int hour = 15;  //정수형
        System.out.println(name +"님, 배송이 시작됩니다. "+ hour +"시 방문 예정 입니다.");
        System.out.println(name +"님, 배송이 완료 되었습니다.");

        double score = 90.5;    // 실수형
        char grade = 'A';       // 한글자만 표현할떄는 String 말고 char을 써줘도 된다.
        name = "강백호";         // name의 값을 강백호로 업데이트 시킴.
        System.out.println(name + "님의 평균 점수는 " + score + "점 이고 학점은 " + grade + "등급 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f; //실수를 float 값으로 만들기 위해서는 뒤에f 를 적어 주어야 한다 (대소문자 둘다 가능)
        System.out.println(d);
        System.out.println(f);    //결과값이 3.14123456 까지밖에 안나옴 조금더 정밀한 값을 계산하기 위해서는 double를 사용 해 주어야 함.

        //int i = 1000000000000; == > 정수값이 너무 커서 int로는 담을수가 없음. int의 값은 -21억~+21억까지 가능
        //long l = 1000000000000; == > 뒤에 L을 붙혀줘야 한다. 왜냐하면 값을 인트라고 인식하고 있기 때문 
        //long l = 1000000000000L;      // 뒤에 L을 붙혀 줌으로써 long이라는것을 인식해서 사용할수 있음
        long l = 1_000_000_000_000L;    // 이처럼 값이 커서 보기 힘들때는 언더바 _ 를 사용해서 적어줘도 위의 값과 같이 구분이 가능 하다.
        System.out.println(l);          // 이처럼 값이 21억을 초과한다면 long을쓰고 아니라면 int를 써주면 된다.

        // 총정리
        // int, long 21억이 넘는 값을 지정해줄때는 long 아니라면 int
        // double float 정밀한 값을 요구 할때는 double 아니라면 float
        // String char 하나의 문자를 표현하기 위한 char 아니라면 String
        // blooean 참과 거짓을 구분

        // 사용하려는 데이터값에 맞는 적합한 자료형을 선택하면 된다 작은 범위의 계산을 위해서 너무 큰 자료형을 사용하면 그만큼의 공간이 낭비가 되고
        // 큰 범위의 계산을 해야 하는데 그만큼의 범위를 감당할수 없는 작은 자료형을 쓰게 되면 문제가 된다
    }
}
