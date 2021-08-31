package chap02.sec03.exam06;

// 문자열 결합 연산
public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int value = 10 + 2 + 8; // 20
        System.out.println("value: " + value);

        // 문자열 결합 연산
        String str1 = 10 + 2 + "8"; //128
        System.out.println("str1: " + str1);

        String str2 = 10 + "2" + 8; // 1028
        System.out.println("str2: " + str2);

        String str3 = "10" + 2 + 8; //1028
        System.out.println("str3: " + str3);

        String str4 = "10" + (2 + 8); // 1010
        System.out.println("str4: " + str4);
    }
}
