package headfirst.designpatterns.proxy;

public class GumballMonitor {
	GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void report() {
		System.out.println("뽑기 기계 위치 : " + machine.getLocation());
		System.out.println("현재 재고 : " + machine.getCount() + "개");
		System.out.println("현재 상태 : " + machine.getState());
	}
}
