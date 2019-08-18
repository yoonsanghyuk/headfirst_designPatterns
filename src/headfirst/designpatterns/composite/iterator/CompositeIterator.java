package headfirst.designpatterns.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

import headfirst.designpatterns.composite.component.MenuComponent;
import headfirst.designpatterns.composite.composite.Menu;

public class CompositeIterator implements Iterator<MenuComponent>{

	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	
	@Override
	public MenuComponent next() {
		if(hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu) {
				stack.push(((Menu) component).createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}else {
			Iterator<MenuComponent> iterator = stack.peek();
			if( !iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
	}

}
