package Chap_04;

public class _06_NestedLoop {
    public static void main(String[] args) {
        // 별 찍기
/*      *
        **
        ***
        ****
        *****
        */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
