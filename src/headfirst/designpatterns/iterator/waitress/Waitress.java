package headfirst.designpatterns.iterator.waitress;

import headfirst.designpatterns.iterator.iterator.Iterator;
import headfirst.designpatterns.iterator.menu.DinerMenu;
import headfirst.designpatterns.iterator.menu.MenuItem;
import headfirst.designpatterns.iterator.menu.PancakeHouseMenu;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("메뉴\n----\n아침 메뉴");
		printMenu(pancakeIterator);
		
		System.out.println("\n점심 메뉴");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	
	
}
