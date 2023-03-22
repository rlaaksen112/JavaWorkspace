package Chap_03;
public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and",","));  // " and" 를 ","로 변환
        System.out.println(s.substring(7)); // 인덱스기준 7부터 시작
        System.out.println(s.substring(s.indexOf("Java"))); // indexOf로 위치를 찾고 거기서부터 시작
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
    }
}
