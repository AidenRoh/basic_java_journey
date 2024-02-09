package yalco.sec09functionalProgramming.chap03methodReference;

public class Button {
	private String text;
	public Button(String text) { this.text = text; }
	public Button(String text, String sound) {
		this(text);
		onClickListener = () -> System.out.println(sound + " " + sound);
	}
	public String getText() { return text; }

	private Runnable onClickListener;
	public void setOnClickListener(Runnable onClickListener) {
		this.onClickListener = onClickListener;
	}
	public void onClick () {
		onClickListener.run();
	}
}
