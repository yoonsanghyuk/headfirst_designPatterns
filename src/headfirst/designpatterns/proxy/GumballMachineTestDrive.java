package headfirst.designpatterns.proxy;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		/**
		 * run configurations -> arguments 추가 필요
		 * IDE 사용시 번거로우니 임시로 할당함.
		 */
		String[] testArgs = {"Seattle","112"};
		args = testArgs;
		
		int count = 0;
		
		if(args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0], count);
		
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		monitor.report();
		
		/**
		 * 원격 프록시를 만들 차례...
		 */
	}
}
