package abstractex.quiz;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {

		ArrayList<Animal1> list = new ArrayList<>();

		list.add(new Human1());
		list.add(new Tiger1());

		for (Animal1 animal1 : list) {
			animal1.sleep();
			animal1.move();

			if (animal1 instanceof Human1) {
				Human1 human1 = (Human1) animal1;
//				human1.move();
				human1.readBook();
			} else if (animal1 instanceof Tiger1) {
				Tiger1 tiger1 = (Tiger1) animal1;
//				tiger1.move();
				tiger1.hunting();
			}
		}
	}

}