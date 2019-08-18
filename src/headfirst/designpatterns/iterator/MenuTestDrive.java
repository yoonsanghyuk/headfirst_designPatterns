package headfirst.designpatterns.iterator;

import java.util.ArrayList;

import headfirst.designpatterns.iterator.menu.CafeMenu;
import headfirst.designpatterns.iterator.menu.DinerMenu;
import headfirst.designpatterns.iterator.menu.Menu;
import headfirst.designpatterns.iterator.menu.PancakeHouseMenu;
import headfirst.designpatterns.iterator.waitress.Waitress;

public class MenuTestDrive {
	public static void main(String[] args) {
//		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//		DinerMenu dinerMenu = new DinerMenu();
//		CafeMenu cafeMenu = new CafeMenu();
		
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new PancakeHouseMenu());
		menus.add(new DinerMenu());
		menus.add(new CafeMenu());
		
		Waitress waitress = new Waitress(menus);
		
		waitress.printMenu();
	}
}
