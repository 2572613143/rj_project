package stdent;

import com.jh182.Person;

public class Stdent extends Person{
	//构造方法 修饰符public+类名(){}
	//姓名属性
	int score;
	public Stdent() {}
	public Stdent(String mz,int cj) {
		this.score = cj;
		this.name = mz;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}//成绩属性


}
