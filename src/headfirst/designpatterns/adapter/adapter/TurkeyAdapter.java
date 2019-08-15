package headfirst.designpatterns.adapter.adapter;

import headfirst.designpatterns.adapter.adaptee.Duck;
import headfirst.designpatterns.adapter.adaptee.Turkey;
import headfirst.designpatterns.adapter.adaptee.WildTurkey;

public class TurkeyAdapter implements Duck{
	Turkey turkey;
	
	public TurkeyAdapter(WildTurkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
