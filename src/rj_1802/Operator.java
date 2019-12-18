package rj_1802;

public class Operator {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		System.out.println("先加"+(++i));
		System.out.println("后加"+(j++));
		System.out.println("不管先加还是后加最后输出i="+i);
		System.out.println("不管先加还是后加最后输出j="+j);
		int a=2;
		a=a+3;
		System.out.println(a);
		
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		
		E01 e1=new E01();
		E01 e2=new E01();
		System.out.println(e1==e2);
		
	}

}
