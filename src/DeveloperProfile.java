import java.util.Scanner;

public class DeveloperProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        String name = scanner.nextLine().trim();

        System.out.print("희망 직무: ");
        String role = scanner.nextLine().trim();

        System.out.print("GitHub 주소: ");
        String githubUrl = scanner.nextLine().trim();

        System.out.print("학습 기간(개월): ");
        int studyMonths = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("프로젝트 개수: ");
        int projectCount = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("취업 가능 여부(true/false): ");
        boolean available = Boolean.parseBoolean(scanner.nextLine().trim());

        System.out.print("한 줄 소개: ");
        String introduction = scanner.nextLine().trim();

        System.out.printf("%s | %s%n", name, role);
        System.out.printf("Java %d개월 | 프로젝트 %d개%n", studyMonths, projectCount);
        System.out.printf("취업 가능: %b%n", available);
        System.out.println(introduction);

        scanner.close();
    }
}