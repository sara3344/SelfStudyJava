package chap04.sec01.exam03;

// if-else if-else문
public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("점수가 100~90점입니다.");
            System.out.println("등급은 A입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80~89점입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70~79점입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
