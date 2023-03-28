package Chap_06;

public class _04_OverLoading {
    public static int getPower(int num){
        return num * num;
    }
    public static int getPower(String num){
        int number = Integer.parseInt(num);
        return number * number;
    }


    public static void main(String[] args) {
        //  메소드 오버로딩 (전달값의 타입이 다르거나 전달 갯수가 다를때는 같은 이름의 메소드를 여러번 사용 할 수 있다.)
        //  반환형이 다른 형태로는 중복 정의 할 수 없다 (이미 int형의 메소드가 있는데 double형의 같은 메소드를 만든다던가...)
        System.out.println(getPower(3));     // 9
        System.out.println(getPower("3"));   // 9
        System.out.println(getPower("4"));   // 16

        //  메소드가 필요한 이유.
        //  행동은 같으나 들어가는 값만 다를때 중복되는 작업 시간을 줄여준다.
    }
}
