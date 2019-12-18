package rj_1802;

import java.io.Serializable;
//修饰符+class+类名+extends（继承）+父类+implements（实现）+父接口
public class Lei extends Object implements Serializable{
	private static final long serialVersionUID = 1L;
	//第一种是修饰范围性的public 公有的  protected 受保护 的  private 私有的
	//第二种是修饰功能性的static 静态的，final 最终的（表示该类不能被继承）
	public static final class A{}
	protected static final class B{}
	private static final class Ea{}
	static final class d{}
	public static final  int age=20;
	public static  int age2=25;
	public static final  String name="milk";
	//定义成员方法：修饰符+返回数据类型+成员方法名([参数类型 参数名]){}
	//修饰符可以多写一个synchronized ：同步的，一般不写
	//返回类型是void 不需要return语句
	//其他返回类型，方法体里面必须有return语句，返回值的类型也要和方法中声明的类型一致
	public synchronized void getage(int nianling) {}
	public synchronized double getage() {return 0.0;}
}
