package com.final_;
class animal{
	//如果一个成员变量被final修饰，那么在本类中不能被赋值
	final String name="名字";
	
	public  void  shout() {}
	
	public String toString() {
		return "这是一只动物";
	}
}
class dog extends animal{
	final String name="名字";
	@Override
	public  void shout() {}
	@Override
	public String toString() {
		return "这是一只小狗";
	}
}
public class E07{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		animal dw=new animal();
		dog xg=new dog();
		System.out.println(xg);
		System.out.println(dw.toString());
	}

}
