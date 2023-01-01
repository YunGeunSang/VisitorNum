import java.util.Scanner;
public class VisitorNum2 {
    public static void main(String[] args) {

        // 인공지능 프로그램 V2
        // 1. a와 b 값을 입력받는다.
        // 2. 광고비를 저장한다
        // 3. 입력받은 값 출력.
        // 3. AI 예측 수를 계산한다.

        Scanner scanner = new Scanner(System.in); // 입력값을 받기 위해 Scanner 클래스 선언
        float a, b; // 입력값 a, b
        float[] price; // 광고비를 저장할 float형 배열

        // 1
        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("=".repeat(30));
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        a = scanner.nextFloat();
        System.out.print("[System] b 값을 입력하여 주세요 : ");
        b = scanner.nextFloat();
        System.out.println("=".repeat(30));
        System.out.println();

        // 2
        price = new float[]{580.0f, 700.0f, 810.0f, 840.0f}; // 광고비를 배열 price에 저장한다.

        // 3
        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다.");
        for (int i = 0;i < price.length;i++){ // 반복문을 사용하여 광고비 값 출력
            System.out.printf("%d 번째) %.1f원  ", i + 1, price[i]);

        }
        System.out.println();
        System.out.println();

        // 4
        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");
        for(int j = 0;j < price.length;j++){
            float result = (a * price[j]) + b;
            System.out.printf("%d 번째 예측) %.1f회 방문\n", j, result);
        }

    }
}
