package Ch01;

public class Ch01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Korea";
		
		System.out.println(str.charAt(0));
		
		
		// 문자 하나씩 빼서 출력하기
		for (int i = 0; i < str.length(); i ++) {
			
			System.out.println(str.charAt(i));
		}

		
		// 문자열을 문자 배열로 변경
		char [] charrArr = str.toCharArray();
		
		for (int i = 0; i < charrArr.length; i ++) {
			System.out.println(charrArr);
		}
		
	}

}
