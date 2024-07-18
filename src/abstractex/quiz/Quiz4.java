package abstractex.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Car2> list = new ArrayList<>();
		
		list.add(new Bus1());
		list.add(new AutoCar1());
		
		for(Car2 car2 : list) {
			
		}
		
	}

}


//차 클래스
abstract class Car2 {
	
	public abstract void run();
	public abstract void refuel();
	
}

//버스 클래스
class Bus1 extends Car2 {

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

//자동차 클래스
class AutoCar1 extends Car2 {

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