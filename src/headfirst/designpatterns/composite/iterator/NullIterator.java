package headfirst.designpatterns.composite.iterator;

import java.util.Iterator;

import headfirst.designpatterns.composite.component.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

}
