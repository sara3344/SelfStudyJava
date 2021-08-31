package chap04.sec02.exam02;

// 1부터 100까지 합을 출력
public class ForSumFrom1To100Example1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            sum += 1;
        }
        System.out.println("1~100 합 : " + sum); // 합 5050
    }
}
