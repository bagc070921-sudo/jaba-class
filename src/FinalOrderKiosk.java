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
 *
 * 확인할 상황
 * 1. 상품 없이 4 입력 -> "먼저 상품을 선택하세요."
 * 2. 수량에 0 입력 -> 다시 수량 입력
 * 3. 0~4 이외의 번호 입력 -> 메뉴 번호 안내
 * 4. 30,000원과 50,000원 경계에서 할인율 확인
 */
public class FinalOrderKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coffeeCount = 0;
        int sandwichCount = 0;
        int waterCount = 0;
        int orderAmount = 0;
        boolean paid = false;

        orderLoop:
        while (true) {
            System.out.println("\n===== 학과 행사 간식 주문 =====");
            System.out.println("1. 커피 2,500원");
            System.out.println("2. 샌드위치 4,500원");
            System.out.println("3. 생수 1,000원");
            System.out.println("4. 결제");
            System.out.println("0. 주문 취소");
            System.out.print("메뉴 번호 입력: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1: {
                    int qty;
                    while (true) {
                        System.out.print("커피 수량 입력: ");
                        qty = scanner.nextInt();
                        if (qty < 1) {
                            System.out.println("수량은 1개 이상 입력하세요.");
                            continue;
                        }
                        break;
                    }
                    coffeeCount += qty;
                    System.out.println("커피 " + qty + "개가 담겼습니다.");
                    break;
                }
                case 2: {
                    int qty;
                    while (true) {
                        System.out.print("샌드위치 수량 입력: ");
                        qty = scanner.nextInt();
                        if (qty < 1) {
                            System.out.println("수량은 1개 이상 입력하세요.");
                            continue;
                        }
                        break;
                    }
                    sandwichCount += qty;
                    System.out.println("샌드위치 " + qty + "개가 담겼습니다.");
                    break;
                }
                case 3: {
                    int qty;
                    while (true) {
                        System.out.print("생수 수량 입력: ");
                        qty = scanner.nextInt();
                        if (qty < 1) {
                            System.out.println("수량은 1개 이상 입력하세요.");
                            continue;
                        }
                        break;
                    }
                    waterCount += qty;
                    System.out.println("생수 " + qty + "개가 담겼습니다.");
                    break;
                }
                case 4: {
                    if (coffeeCount == 0 && sandwichCount == 0 && waterCount == 0) {
                        System.out.println("먼저 상품을 선택하세요.");
                        continue orderLoop;
                    }

                    orderAmount = coffeeCount * 2500 + sandwichCount * 4500 + waterCount * 1000;

                    int discountRate = 0;
                    if (orderAmount >= 50000) {
                        discountRate = 10;
                    } else if (orderAmount >= 30000) {
                        discountRate = 5;
                    }

                    int discountPrice = orderAmount * discountRate / 100;
                    int finalPrice = orderAmount - discountPrice;

                    System.out.println("\n===== 영수증 =====");
                    if (coffeeCount > 0) {
                        System.out.println("커피 x " + coffeeCount + " = " + (coffeeCount * 2500) + "원");
                    }
                    if (sandwichCount > 0) {
                        System.out.println("샌드위치 x " + sandwichCount + " = " + (sandwichCount * 4500) + "원");
                    }
                    if (waterCount > 0) {
                        System.out.println("생수 x " + waterCount + " = " + (waterCount * 1000) + "원");
                    }
                    System.out.println("주문 금액: " + orderAmount + "원");
                    System.out.println("할인율: " + discountRate + "%");
                    System.out.println("할인 금액: " + discountPrice + "원");
                    System.out.println("최종 결제 금액: " + finalPrice + "원");
                    System.out.println("결제가 완료되었습니다. 이용해 주셔서 감사합니다.");

                    paid = true;
                    break orderLoop;
                }
                case 0: {
                    System.out.println("주문을 취소합니다.");
                    break orderLoop;
                }
                default: {
                    System.out.println("0~4 사이의 메뉴 번호를 입력하세요.");
                }
            }
        }

        if (!paid) {
            System.out.println("결제 없이 프로그램을 종료합니다.");
        }

        scanner.close();
    }
}