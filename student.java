package NumberProgram;

public class student 
{
	String name;
	double marks;
	public student(String name, double marks )
	{
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
