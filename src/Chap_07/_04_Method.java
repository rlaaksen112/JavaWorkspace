package Chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.autoReport();    // 지원 안됨
        BlackBox.conAutoReport = true;
        b1.autoReport();    // 지원 됨

        b1.insertMemoryCard(256);

        //  일반 영상 : 1
        //  이벤트 영상 (충돌 감지) : 2
        int file1 = b1.getVideoFileCount(1);
        int file2 = b1.getVideoFileCount(2);
        int file3 = b1.getVideoFileCount(57);

        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
    }
}
