package yalco.sec11multitasking.chap9;

public class Counter {
	private int count = 0;

	public Counter(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void increase() {
		count++;
	}
}