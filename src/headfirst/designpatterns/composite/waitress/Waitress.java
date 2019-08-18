package headfirst.designpatterns.composite.waitress;

import java.util.Iterator;

import headfirst.designpatterns.composite.component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		/* 
		 * 관점에 따라 전체가 될수도, 부분이 될수도 있다는 특징 덕에,
		 * MenuComponent를 단건의 변수로 지니더라도 전체 메뉴(allMenus)가 될 수 있다.
		 */
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n--------");
		
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			}catch (UnsupportedOperationException e) {
				
			}
		}
	}
}
