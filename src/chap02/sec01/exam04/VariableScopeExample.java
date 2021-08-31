package chap02.sec01.exam04;

// 변수의 사용 범위
public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2;
            v2 = v1 - 10;
        }
//        int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러
        // v2는 if문 안에 있어서 사용 ㄴㄴ
        int v3 = v1 + 5;
        System.out.println(v3);
    }
}
