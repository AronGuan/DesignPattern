package pers.aron;

import pers.aron.fly.FlyNoWay;
import pers.aron.fly.FlyWithWings;
import pers.aron.quack.MuteQuack;
import pers.aron.quack.Squeak;



public class ADuck extends Duck {
	public ADuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}

	public void display() {
		System.out.println("I'm a duck model.");
	}

	public void changeBehavior() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	public static void main(String[] args) {
		ADuck aDuck = new ADuck();
		aDuck.display();
		aDuck.swim();
		aDuck.performFly();
		aDuck.performQuack();
		aDuck.changeBehavior();
		aDuck.performFly();
		aDuck.performQuack();
	}
}
