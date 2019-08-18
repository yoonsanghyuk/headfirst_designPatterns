package headfirst.designpatterns.iterator.waitress;

import java.util.ArrayList;
import java.util.Iterator;

import headfirst.designpatterns.iterator.menu.Menu;
import headfirst.designpatterns.iterator.menu.MenuItem;

public class Waitress {
	ArrayList<Menu> menus;
	
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
		}
//		System.out.println("메뉴\n----\n아침 메뉴");
//		printMenu(pancakeIterator);
//		System.out.println("\n점심 메뉴");
//		printMenu(dinerIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	
	
}
