package Ch01;

public class Ch01_03 {
	public static void main(String[] args) {
	
		int a = 10;
		int b;
		b = a;
		
		// 배열의 이름은 실제 배열의 값의 첫번째 원소값이 저장되어 있는 주소값
		int[] intArr1 = {10,20,30};
		int[] intArr2 = null;
		
		intArr2 = intArr1;
		
		
		// 배열의 모든 원소를 출력하는 for문
		for (int i = 0; i < intArr2.length; i++) {
			System.out.println(intArr2[i]);
			
			
		}
		
		
		if (intArr1[0] == intArr2[0]) {
			System.out.println("주소 동일!!");
		}
		

}

}
