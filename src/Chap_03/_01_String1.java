package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase());    // 문장 전체를 대문자로 변경

        // 소문자 변환
        System.out.println(s.toLowerCase());    // 문장 전체를 소문자로 변경

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#"));   // false
        System.out.println(s.indexOf("Java"));  // 문자 위치 확인
        System.out.println(s.indexOf("C#"));    // 문자 위치 확인시 포함되지 않는 단어라면 -1로 뜬다
        System.out.println(s.indexOf("and"));   // 찾는 문자가 여러번 중복되면 젤 처음 나오는 위치를 알려줌
        System.out.println(s.lastIndexOf("and")); // 찾는 문자가 여러번 중복될때 젤 마지막에 나오는 문자의 위치를 알수있음
        System.out.println(s.startsWith("I like"));   // 이 문자열이 I like 로 시작하면 true 아니면 false
        System.out.println(s.endsWith("."));          // 문자열이 .으로 끝나면 true 아니면 false
    }
}
