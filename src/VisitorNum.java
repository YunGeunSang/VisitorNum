import java.util.Scanner;
public class VisitorNum {
    public static void main(String[] args) {

        // 인공지능 프로그램 V1
        // 0. a와 b값은 임의의 값 2와 1로 주어진다
        // 1. 예측에 영향을 주는 요인(광고비)을 입력받는다
        // 2. 입력값을 출력한다
        // 3. 예측 수 계산 (예측 수 = (a * 광고비) + b)

        // 0
        Scanner scanner = new Scanner(System.in); // 광고비를 입력 받기위해 Scanner 클래스 선언
        int a = 2; // 계산에 필요한 a, b 값 변수 선언
        int b = 1;
        int price; // 입력받을 광고비 변수
        int result; // AI 예측 결과값을 저장할 변수


        System.out.println("[인공지능 프로그램 V1]");
        System.out.println("=".repeat(25));

        // 1
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        price = Integer.parseInt(scanner.nextLine()); // 입력값을 정수로 변환하여 price에 저장

        // 2
        System.out.printf("[안내] 입력된 광고비는 %d 원 입니다.\n", price);

        // 3
        result = (a * price) + b; // 예측 값을 계산한다
        System.out.printf("[안내] AI의 예측(클릭 수)은 %d회 입니다.\n", result);

        scanner.close();

    }
}