package rj_1802;

import java.time.format.TextStyle;

public class Text {
	public Text() {
		System.out.println("构造方法一被调用了");
	}
	public Text(int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public Text(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public void openMouth() {}
	public void speak() {this.openMouth();}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Text text=new Text(true);
	}
	

}
