package SelfLearning;

import java.util.Scanner;

public class Equlnumber {
	public static void main(String[] args) {
        // 여기에 코드를 작성하세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int num1 = scanner.nextInt();
		
		
		System.out.println("두번째 숫자: ");
		int num2 = scanner.nextInt();
		
		if (num1 == num2) {
            System.out.println("두 숫자는 같습니다.");
        } else if (num1 > num2) {
            System.out.println("더 큰 숫자는: " + num1);
        } else {
            System.out.println("더 큰 숫자는: " + num2);
        }
		
		scanner.close();
		
		
    }
	

}
