package chap02.sec04.exam05;

import java.util.Scanner;

// 키보드에서 입력된 내용을 문자열로 얻기
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while (true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }
        System.out.println("종료");
    }
}
