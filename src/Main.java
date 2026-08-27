import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("20: ");
        int age = scanner.nextInt();

        System.out.print("박찬희: ");
        String name = scanner.nextLine();
        // 남아 있던 줄바꿈을 읽어 name이 빈 문자열

        System.out.println(name);

        scanner.close();
    }
}