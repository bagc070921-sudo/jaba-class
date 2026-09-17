class StudentRecord {
    // TODO 1. 학번과 이름을 저장할 String 필드 두 개를 직접 선언하세요.
    String studentId;
    String name;
}

// 파일 이름(StudentRecord.java)과 맞추기 위해 public을 제거했습니다.
class Ch06_1_4_StudentObjects_student {
    public static void main(String[] args) {
        // TODO 2. new로 서로 다른 StudentRecord 객체 두 개를 만들세요.
        StudentRecord first = new StudentRecord();
        StudentRecord second = new StudentRecord();

        // TODO 3. 첫 학생은 202601 김서윤, 둘째 학생은 202602 박민준으로 저장하세요.
        first.studentId = "202601";
        first.name = "김서윤";

        second.studentId = "202602";
        second.name = "박민준";

        // TODO 4. 길이 2의 StudentRecord[]를 만들고 두 객체를 담으세요.
        StudentRecord[] students = new StudentRecord[2];
        students[0] = first;
        students[1] = second;

        // TODO 5. first와 같은 객체를 가리키는 alias를 만들세요.
        StudentRecord alias = first;

        // TODO 6. alias를 통해 첫 학생의 이름을 이하린으로 바꾸세요.
        alias.name = "이하린";

        // TODO 7. 배열 전체를 반복하며 학번과 이름을 출력하세요.
        for (StudentRecord s : students) {
            System.out.println(s.studentId + " " + s.name);
        }

        System.out.println("서로 다른 객체: " + (first != second));
        System.out.println("같은 객체를 가리킴: " + (first == alias));
    }
}