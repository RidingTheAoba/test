package hgs.model;

import hgs.modelI.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack");

	}

}
