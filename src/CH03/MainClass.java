package CH03;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Hyundai", "sonata");
		System.out.println(car1.maxspeed);
		
		// car1.company = "Hyundai";
		// car1.model = "sonata";
		
		car1.drive();
		Car car2 = new Car("kia", "K5");
		
		// car2.company = "Kia";
		//car2.model = "K5";
		
		car2.drive("kia"); 
		// 들어간 매개변수에 따라 골라서 값이 달라짐 
		// 파이썬에서 함수 만들고 이프 돌리던 느낌 
		
		
		Car car3 = new Car("Ford", "ANC", "Black");
		car3.drive(600, 2009);
		

		
		
		int[] a = car3.scores(70,60,50);
		
		// 기본 값으로생성
		Driver driver = new Driver();
		
		Driver driver1 = car3.driverInfo(driver);
		
		
	}

}
