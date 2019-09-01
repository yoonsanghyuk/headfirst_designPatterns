package headfirst.designpatterns.state.context;

import headfirst.designpatterns.state.states.HasQuaterState;
import headfirst.designpatterns.state.states.NoQuarterState;
import headfirst.designpatterns.state.states.SoldOutState;
import headfirst.designpatterns.state.states.SoldState;
import headfirst.designpatterns.state.states.State;
import headfirst.designpatterns.state.states.WinnerState;

public class GumballMachine {
	private State soldState;
	private State soldOutState;
	private State noQuarterState;
	private State hasQuaterState;
	private State winnerState;
	
	private State state = soldOutState;	
	int count =  0;
	
	public GumballMachine(int numberGumballs) {
		
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuaterState = new HasQuaterState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuater();
	}
	
	public void ejectQuarter() {
		state.ejectQuater();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("슬롯에서 알맹이가 나오는 중입니다...");
		if(count != 0) {
			count = count - 1;
		}
	}
	
	
	public int getCount() {
		return count;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuaterState() {
		return hasQuaterState;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n주식회사 왕뽑기");
		result.append("\n자바로 돌아가는 2004년형 뽑기 기계");
		result.append("\n남은 갯수: " + count + " 개");
		result.append("\n");
		result.append("현재 상태는 " + state + "\n");
		return result.toString();
	}

}
