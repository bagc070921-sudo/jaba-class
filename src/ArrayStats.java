import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        // TODO 1. 다섯 개를 모두 입력받도록 반복 조건을 완성하세요.
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 점수(0-100): ");
            int input = Integer.parseInt(scanner.nextLine());

            // TODO 2. 범위를 벗어난 점수는 저장하지 말고 같은 순번을 다시 입력받으세요.
            // 힌트: i를 조정한 다음 continue할 수 있습니다.
            if (input < 0 || input > 100) {
                System.out.println("잘못된 점수입니다. 0~100 사이의 점수를 입력하세요.");
                i--;
                continue;
            }

            // TODO 3. 정상 점수를 scores의 알맞은 위치에 저장하세요.
            scores[i] = input;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        // TODO 4. 반복 조건과 합계 및 최고점 비교 조건을 직접 작성하세요.
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }
        }

        // TODO 5. 정수 나눗셈이 되지 않게 계산하세요.
        double average = (double) sum / scores.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        System.out.println("최고점: " + max);
        System.out.println("최고점 위치: " + (maxIndex + 1) + "번");
    }
}