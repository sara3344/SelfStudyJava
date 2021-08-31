package chap02.sec04.exam04;

import java.io.IOException;

// q를 입력하면 반복 종료
public class QStopExample {
    public static void main(String[] args) throws IOException {
        int keyCode;

        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if (keyCode == 113) {
                break;
            }
        }
        System.out.println("종료");
    }
}
