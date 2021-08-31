package chap03.sec02.exam05;

// char 타입의 산술 연자
public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1; // char c1=bb;로 컴파일됨
        int c4 = 'A' + 1;
        char c2 = 'A';
//        char c3 = c2 + 1; // 산술 연에서 사용되면 int 그래서 컴파일 에러
        System.out.println("c1: " + c1); // B
        System.out.println("c2: " + c2); // A
//        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
    }
}
