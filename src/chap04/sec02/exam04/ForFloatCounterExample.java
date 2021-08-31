package chap04.sec02.exam04;

// float 타입 카운터 변수
public class ForFloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0; x < 1.0f; x += 0.1f) {
            System.out.println(x); // float 타입으로 정확하게 표현할 수 없음
        }
    }
}
