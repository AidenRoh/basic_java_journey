package yalco.sec11multitasking.chap5.ex02;

public class ManagerRun implements Runnable {
	CoffeeMachine coffeeMachine;
	public ManagerRun(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}

	@Override
	public void run() {
		while (true) {
			coffeeMachine.fill();
		}
	}
}