package Ch02;

public class Ch02_01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student 클래스로 객체 선언
		// 가져올 파일과 똑같아야 함 
		student stu1 = new student();
		student stu2 = new student();
		
		int[] a = new int[5];
		
		// 클래스 호출 시 리스트가 보임 
		stu1.name = "Khun Eduan";
		stu1.age = 19;
		stu1.StudentID = "1221";
		stu1.grade = 12;
		
		
		stu2.name = "Ivanuv mona";
		stu1.age = 17;
		stu1.StudentID = "0508";
		stu1.grade = 8;
		
		stu1.play();
		stu2.study();
		
		
		
		
		
	}

}
