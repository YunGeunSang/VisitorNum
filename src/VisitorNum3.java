public class VisitorNum3 {
    public static void main(String[] args) {
        // 인공지능 프로그램 V3
        // 1. 실제값과 예측값의 2차원 배열 데이터 생성
        // 2. 배열 데이터 출력
        // 3. 배열값을 바탕으로 오차, 제곱, 합 계산

        // 1
        float[][] list = new float[][] {{374.0f, 385.0f, 375.0f, 401.0f},
                                        {1161.0f, 1401.0f, 1621.0f, 1681.0f}}; // 2차원 배열에 데이터 저장
        float diff; // 오차
        double diff_Pow; // 오차의 제곱
        float AI_Performance = 0; // 오차의 제곱 합


        // 2
        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("=".repeat(25));
        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");
        for(int i = 0; i < list[0].length;i++){ // for 반복문으로 2차원 배열의 내용 출력
            System.out.printf("%d번 째 데이터) [실제값] 웹 페이지 방문자수 : %.1f " +
                    "[인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n", i+1, list[0][i], list[1][i]);

        }
        System.out.println();


        // 3
        for(int j = 0; j < list[0].length;j++){ // 배열의 데이터를 기준으로 for 반복문을 사용하여 오차, 제곱, 합을 계산하여 출력
            diff = list[0][j] - list[1][j];
            diff_Pow = Math.pow(diff, 2); // Math 클래스의 pow 메서드를 사용하여 제곱값 계산
            AI_Performance += diff_Pow;

            System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n", j+1, diff);
            System.out.printf("[안내] 오차의 제곱 : %.1f\n", diff_Pow);
            System.out.println();
        }

        System.out.println("=".repeat(25));
        System.out.printf("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : %.1f\n", AI_Performance);

    }
}
