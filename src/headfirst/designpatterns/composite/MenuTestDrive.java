package headfirst.designpatterns.composite;

import headfirst.designpatterns.composite.component.MenuComponent;
import headfirst.designpatterns.composite.composite.Menu;
import headfirst.designpatterns.composite.leaf.MenuItem;
import headfirst.designpatterns.composite.waitress.Waitress;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
		MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
		MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요!");
		
		MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		// 메뉴 항목을 추가하는 부분 - 메뉴는 일부만 구현된 상황입니다.
		dinerMenu.add(new MenuItem("파스타","마리라나 소스 스파게티, 효모빵도 드립니다.",true, 3.89));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("애플 파이","바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이",true, 1.59));
		// 메뉴 항목을 추가하는 부분
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
