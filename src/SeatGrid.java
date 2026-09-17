public class SeatGrid {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수"};
        int[][] usage = {
                {2, 1, 3},
                {4, 3, 2},
                {1, 3}
        };

        int total = 0;
        int busiestDay = -1;
        int busiestCount = -1;

        // TODO 1. 바깥 반복문으로 각 날짜를 방문하세요.
        for (int day = 0; day < usage.length; day++) {
            int dailyTotal = 0;

            // TODO 2. 현재 날짜의 항목 수에 맞춰 안쪽 반복 조건을 완성하세요.
            for (int room = 0; room < usage[day].length; room++) {
                // TODO 3. dailyTotal에 현재 실습실 사용 인원을 더하세요.
                dailyTotal += usage[day][room];
            }

            // TODO 4. 날짜별 합계를 출력하고, 전체 합계와 가장 바쁜 날짜를 갱신하세요.
            System.out.println(days[day] + "요일: " + dailyTotal + "명");
            total += dailyTotal;

            if (dailyTotal > busiestCount) {
                busiestCount = dailyTotal;
                busiestDay = day;
            }
        }

        System.out.println("전체: " + total + "명");
        System.out.println("가장 바쁜 날: "
                + (busiestDay >= 0 ? days[busiestDay] : "미계산")
                + "요일(" + busiestCount + "명)");
    }
}