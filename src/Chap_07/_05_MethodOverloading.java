package Chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false, false , 10);
        b1.record(true, false , 3);
        b1.record(true, true , 5);

        b1.record();    // 오버로딩으로 기본값을 지정 해줬음


    }
}
