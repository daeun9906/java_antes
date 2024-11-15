package Ch01;

public class Ch01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new int [행][열] 행/열 하나 생략 가능 
		// 열은 나중에 설정해도 행은 무조건 설정해야 함 
		int[][] scores1 = new int[2][3];
		
		// 2행 배열 선언
		int[][] scores2 = new int[2][];
		scores2[0] = new int[3];
		scores2[1] = new int[4];
		
		
		scores1[0][2] = 100;
		
		System.out.println(scores1.length);
		System.out.println(scores2.length);
		
		
		String[] strArray = new String[3];
		strArray[0] = "Korea";
		strArray[1] = "Korea";
		strArray[2] = new String("China");
		
		if (strArray[0] == strArray[1]) {
			System.out.println("두 문자열은 동일합니다!!");
		}
	} 

}
