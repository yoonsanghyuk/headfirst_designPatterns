package headfirst.designpatterns.iterator.iterator;

import headfirst.designpatterns.iterator.menu.MenuItem;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		if(position > items.length || items[position] == null) {
			return false;
		}else {
			return true;
		}
	}
	

}
