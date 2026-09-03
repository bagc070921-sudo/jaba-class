import java.util.Scanner;

public class OperatorTableCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        double first = scanner.nextDouble();

        System.out.print("두 번째 숫자: ");
        double second = scanner.nextDouble();

        double sum = first + second;
        double difference = first - second;
        double product = first * second;

        String quotientText = (second != 0) ? String.valueOf(first / second) : "계산 불가";
        String remainderText = (second != 0) ? String.valueOf(first % second) : "계산 불가";

        System.out.println("덧셈: " + sum);
        System.out.println("뺄셈: " + difference);
        System.out.println("곱셈: " + product);
        System.out.println("나눗셈: " + quotientText);
        System.out.println("나머지: " + remainderText);

        scanner.close();
    }
}