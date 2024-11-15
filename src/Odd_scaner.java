package SelfLearning;

import java.util.Scanner;

public class Odd_scaner {
	public static void main(String[] args) {
        // 여기에 코드를 작성하세요.
		Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 1) {
        	System.out.println(num1 + "는 홀수입니다.");
        	
        		
        	} else{
        		System.out.println(num1 + "짝수입니다.");
        	
        	
        }
        scanner.close();
        
        int a =10;
        

}
	
}
