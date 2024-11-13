public class Student{
	
	int rollno;
	String name;

	public Student(){

	}
	public Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	public void setRollNo(int rollno){
		this.rollno = rollno;
	}
	public int getRollNo(){
		return rollno;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
