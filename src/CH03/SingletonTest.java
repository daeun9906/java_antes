package CH03;

public class SingletonTest {
	// 이게 패턴이라고?? 
	private static SingletonTest singleton = new SingletonTest();
	
	private SingletonTest() {
		// 외부에서 사용할 수 없게 하는 생성자 
		// 타 클래스에서 private는 일반적 방법으로 부를 수 없음 
		
		
		
	}
	
	static SingletonTest getInstance() {
		return singleton;
	}
	
	
	
	
	
	
	
	
	

}
