package CH03;

public class Car {
	// 초기 변수 선언 
	String company;
	String model;
	String color = "black";
	int maxspeed = 200;
	
	// 현재 스피드와 rpm
	int speed;
	int rpm;
	
	// 배열도 필드 1개로 취급 리스트나 딕셔너리 같은 
	int [] price = {10,20,30};
	
	// 얘도 하나의 필드로 취급 
	Driver driver = new Driver();
	// Driver driver; 도 가능 
	

	
	public Car(String company_, String model_) {
		// 생성자랑 매개변수의 이름이 같으면 프로그램이 인식을 못함 
		company = company_;
		model = model_;
		
		// 파이썬의 self와 비슷해서 본인 필드를 가리킴. 필드 쓸 때는 꼭 쓰자
		// this.company = company_; 
		// this.model = model_;
		
		
		
	}
	
	
	public Car(String company_, String model_, String color) {
		// 생성자랑 매개변수의 이름이 같으면 프로그램이 인식을 못함 
		this.company = company_;
		this.model = model_;
		this.color = color;
	
	}
	
	

	void drive() {
		speed = 50;
		System.out.println(speed);
		
		
	}
	
	void drive(int rpm, int speed) {
		
		this.rpm = rpm;
		this.speed = speed;
		System.out.println(this.speed);
		System.out.println(this.rpm);
		
	}
	
	
	
	void drive(String model) {
		this.model = model;
		System.out.println(this.model);
		
		
	}
	
	int [] scores(int math, int eng, int kor) {
		int [] scores = {math + eng + kor};
		
		return scores;
		
		
		
	}
	
	Driver driverInfo(Driver driver){
		this.driver = driver;
		return this.driver ;
		
		
	}
	
	// 정적 변수 
	// 객체 선언 없이도 사용할 수 있음 
	
	public static double PI = 3.14;
	
	// 이게 상수값 선언하기 
	public static final double BIRTH = 0331;
	
	
	
}
