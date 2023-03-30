package Chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution ="FHD";
        b1.price = 200000;
        b1.color = "black";

        //BlackBox b2 = new BlackBox("하양이", "QHD", 300000, "White");  // 기본 생성자 메서드 활용
        //System.out.println(b2.modelName);

        //System.out.println("현재 블박이 갯수 : "+BlackBox.counter);
    }
}
