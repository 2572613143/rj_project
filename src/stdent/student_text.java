package stdent;

public class student_text {
	//protected:子类可见性 只在本包中可以使用，其他访问都是非法的
	//public：公共访问级别 只在本包或者其他包中的子类可以使用，其他访问都是非法的
	//类的成员变量一般是private 这叫类的封装
	//如果要使用成员变量，使用public的getter setter方法
	public static void main(String[] args) {
		Stdent s1=new Stdent();
		s1.setName("MIKE");
		s1.setScore(600);
		Stdent s2	=new Stdent("serena",590);
		System.out.println(s1.getName()+"考了"+s1.getScore()+"分");
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
	
		Course c1=new Course();
		c1.setCoure_name("java程序设计");
		c1.setCoure_book("java基础入门");
		System.out.println(c1.getCoure_name()+"这门课的使用教材是《"+c1.getCoure_book()+"》");
	}
}
