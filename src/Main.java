package SelfLearning;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        // 여기에 코드를 작성하세요.
		Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 숫자의 합: " + sum);

        scanner.close();
    }

}
