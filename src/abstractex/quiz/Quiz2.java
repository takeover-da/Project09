package abstractex.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		Bus bus = new Bus();
		bus.run();
		bus.refuel();
		bus.takePassenger();
		
		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.refuel();
		autoCar.load();
		
	}

}

// 차 클래스
abstract class Car1 {
	
	public abstract void run();
	public abstract void refuel();
	
}

// 버스 클래스
class Bus extends Car1 {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전 합니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
}

// 자동차 클래스
class AutoCar extends Car1 {

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
	
}