package chap04.sec02.exam05;

// 구구단 출력하기
public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }
}
