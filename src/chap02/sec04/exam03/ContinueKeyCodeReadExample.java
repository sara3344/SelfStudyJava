package chap02.sec04.exam03;

import java.io.IOException;

// 입력된 키의 개수와 상관없이 키코드 읽기
public class ContinueKeyCodeReadExample {
    public static void main(String[] args) throws IOException {
        int keyCode;

        while (true) { // 무한반복
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }
    }
}
