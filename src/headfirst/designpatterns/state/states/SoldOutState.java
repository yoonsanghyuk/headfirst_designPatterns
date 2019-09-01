package headfirst.designpatterns.state.states;

import headfirst.designpatterns.state.context.GumballMachine;

public class SoldOutState implements State{

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("동전을 넣을 수 없습니다, 이 기기는 매진됬어요!");
	}

	@Override
	public void ejectQuater() {
		System.out.println("반환할 수 없습니다. 삽입된 동전이 없습니다!");
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨군요, 그러나 더이상 알맹이가 없습니다!");
	}

	@Override
	public void dispense() {
		 System.out.println("알맹이가 더이상 없습니다!");
	}
	
	@Override
	public String toString() {
		return "매진 중";
	}
}
