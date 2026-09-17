import java.util.Arrays;

public class ReferenceCheck {
    public static void main(String[] args) {
        int[] original = {10, 20};

        // TODO 1. 새 배열을 만들지 말고 original과 같은 배열을 가리키게 하세요.
        int[] alias = original;

        // TODO 2. alias를 통해 첫 항목을 30으로 바꾸세요.
        alias[0] = 30;

        int[] sameValues = {30, 20};
        System.out.println("original[0]: " + original[0]);
        System.out.println("같은 객체: " + (original == sameValues));
        System.out.println("항목이 같음: " + Arrays.equals(original, sameValues));

        String[] names = new String[4];
        names[0] = "김서윤";
        names[2] = "박민준";

        // TODO 3. 배열 전체를 순회하면서 null이 아닌 이름만 출력하세요.
        // 반복 조건은 names.length를 이용해 직접 적으세요.
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);
            }
        }
    }
}