package hgs.test;

import hgs.model.Duck;
import hgs.model.FlyRocketPowered;
import hgs.model.MallardDuck;
import hgs.model.ModelDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
