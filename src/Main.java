import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {10, 20, 30};
        int[] numbers2 = {10, 20, 30};
        int[] numbers3 = numbers1;

        // 1. == 연산자: 메모리 주소(참조)가 같은지 비교
        System.out.println(numbers1 == numbers2); // false (내부 값은 같지만 서로 다른 객체)
        System.out.println(numbers1 == numbers3); // true (같은 객체를 가리킴)

        // 2. Arrays.equals(): 배열 안의 요소(값)가 순서대로 같은지 비교
        System.out.println(Arrays.equals(numbers1, numbers2)); // true (내부 값이 10, 20, 30으로 동일)
    }
}