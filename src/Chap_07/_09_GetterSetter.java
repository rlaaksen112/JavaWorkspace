package Chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "Black";

        BlackBox b2 = new BlackBox();
        b2.setPrice(5445454);
        System.out.println(b2.price);
        b2.setPrice(123123123);
        System.out.println(b2.price);

    }
}
