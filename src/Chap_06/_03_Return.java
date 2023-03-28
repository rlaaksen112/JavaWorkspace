package Chap_06;

public class _03_Return {
    //  호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "051 - 335 - 2740";
        return phoneNumber;
    }
    //  호텔 주소
    public static String getAdd(){
        String Add = "부산 어딘가";
        return Add;
    }

    public static void main(String[] args) {
        String phoneNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + phoneNumber);

        String Add = getAdd();
        System.out.println("호텔 주소 : " + Add);

    }
}
