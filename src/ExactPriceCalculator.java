import java.util.Scanner;

public class ExactPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("단가(0): ");
        long priceWon = scanner.nextLong();

        System.out.print("수량(0): ");
        long count = scanner.nextLong();

        System.out.print("할인율(0~100): ");
        long discountRate = scanner.nextLong();

        long subtotalWon = priceWon * count;
        long discountWon = subtotalWon * discountRate / 100;
        long paymentWon = subtotalWon - discountWon;

        System.out.println(paymentWon);

        scanner.close();
    }
}