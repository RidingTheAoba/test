package hgs.model;

import hgs.modelI.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Silence");

	}

}
