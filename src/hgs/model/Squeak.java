package hgs.model;

import hgs.modelI.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("squeak");

	}

}
