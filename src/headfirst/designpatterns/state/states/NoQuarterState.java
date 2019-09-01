package headfirst.designpatterns.state.states;

import headfirst.designpatterns.state.context.GumballMachine;

public class NoQuarterState implements State{

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuaterState());
	}

	@Override
	public void ejectQuater() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void turnCrank() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void dispense() {
		 System.out.println("동전을 넣어주세요.");
	}
	@Override
	public String toString() {
		return "동전 대기 중";
	}
}
