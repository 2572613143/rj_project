package stdent;


public class Course {

	 String Coure_id;
	 String Coure_name;
	 String Coure_book;
	
	public Course() {}

public Course(String coure_name, String coure_book) {
		super();
		Coure_name = coure_name;
		Coure_book = coure_book;
	}
	
//	public Course(String ab,String cd) {
//		Coure_id = ab;
//		Coure_book=cd;
//	}

	public String getCoure_id() {
		return Coure_id;
	}
	public void setCoure_id(String coure_id) {
		Coure_id = coure_id;
	}
	public String getCoure_name() {
		return Coure_name;
	}
	public void setCoure_name(String coure_name) {
		Coure_name = coure_name;
	}
	public String getCoure_book() {
		return Coure_book;
	}
	public void setCoure_book(String coure_book) {
		Coure_book = coure_book;
	}
	
	

	
}
