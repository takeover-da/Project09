package abstractex.quiz;

public class Quiz3 {

	public static void main(String[] args) {

		
		
	}

}

// 동물 클래스
abstract class Animal1 {
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public abstract void move();
	
}

// 인간 클래스
class Human1 extends Animal1 {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

// 호랑이 클래스
class Tiger1 extends Animal1 {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}