import java.util.Scanner;

/*
 * [최종 실습 4] 학과 행사 간식 주문 키오스크
 *
 * 메뉴와 가격
 * 1. 커피 2,500원
 * 2. 샌드위치 4,500원
 * 3. 생수 1,000원
 * 4. 결제
 * 0. 주문 취소
 *
 * 주문 규칙
 * - 상품 수량은 1개 이상이어야 한다.
 * - 결제 전에 선택한 상품이 없으면 메뉴로 돌아간다.
 * - 주문 금액이 50,000원 이상이면 10% 할인한다.
 * - 주문 금액이 30,000원 이상 50,000원 미만이면 5% 할인한다.
 * - 그 외에는 할인하지 않는다.
 * - 결제가 끝나면 영수증을 출력하고 프로그램을 끝낸다.
 * - 0을 입력하면 결제하지 않고 주문을 취소한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"커피", "샌드위치", "생수"};
        int[] prices = {2500, 4500, 1000};
        int[] quantities = {0, 0, 0};

        while (true) {
            System.out.println();
            System.out.println("===== 학과 행사 간식 주문 키오스크 =====");
            System.out.println("1. 커피 2,500원");
            System.out.println("2. 샌드위치 4,500원");
            System.out.println("3. 생수 1,000원");
            System.out.println("4. 결제");
            System.out.println("0. 주문 취소");
            System.out.print("메뉴 번호 입력: ");
            int choice = scanner.nextInt();

            // 0~4 이외의 번호 입력 -> 메뉴 번호 안내
            if (choice < 0 || choice > 4) {
                System.out.println("0~4 사이의 메뉴 번호를 입력하세요.");
                continue;
            }

            // 0을 입력하면 결제하지 않고 주문을 취소한다.
            if (choice == 0) {
                System.out.println("주문을 취소합니다.");
                scanner.close();
                return;
            }

            // 결제 선택
            if (choice == 4) {
                int totalCount = quantities[0] + quantities[1] + quantities[2];

                // 상품 없이 4 입력 -> "먼저 상품을 선택하세요."
                if (totalCount == 0) {
                    System.out.println("먼저 상품을 선택하세요.");
                    continue;
                }

                int total = 0;
                for (int i = 0; i < 3; i++) {
                    total += prices[i] * quantities[i];
                }

                int discountRate = 0;
                if (total >= 50000) {
                    discountRate = 10;
                } else if (total >= 30000) {
                    discountRate = 5;
                }

                int discountAmount = total * discountRate / 100;
                int finalAmount = total - discountAmount;

                System.out.println();
                System.out.println("===== 영수증 =====");
                for (int i = 0; i < 3; i++) {
                    if (quantities[i] > 0) {
                        int subtotal = prices[i] * quantities[i];
                        System.out.println(names[i] + " x " + quantities[i] + " = " + subtotal + "원");
                    }
                }
                System.out.println("주문 금액: " + total + "원");
                System.out.println("할인율: " + discountRate + "%");
                System.out.println("할인 금액: " + discountAmount + "원");
                System.out.println("최종 결제 금액: " + finalAmount + "원");
                System.out.println("결제가 완료되었습니다. 이용해 주셔서 감사합니다.");

                scanner.close();
                return;
            }

            // 1~3번: 상품 수량 입력
            int index = choice - 1;
            int qty;
            while (true) {
                System.out.print(names[index] + " 수량 입력: ");
                qty = scanner.nextInt();

                // 수량에 0 입력 -> 다시 수량 입력
                if (qty < 1) {
                    System.out.println("수량은 1개 이상 입력하세요.");
                    continue;
                }
                break;
            }

            quantities[index] += qty;
            System.out.println(names[index] + " " + qty + "개가 담겼습니다.");
        }
    }
}