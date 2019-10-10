package headfirst.designpatterns.proxy;

import java.util.Random;


public class HasQuaterState implements State{
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	
	public HasQuaterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("동전은 한개만 넣어주세요.");
		
	}

	@Override
	public void ejectQuater() {
		System.out.println("동전이 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이를 돌렸습니다.");
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		
	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}
	
	@Override
	public String toString() {
		return "동전 들어있는 중";
	}

}
