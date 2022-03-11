package week3.assignment.org.student;
import week3.assignment.org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Ramya - Student Name invoked from Student Class");
	}
	public void studentDept()
	{
		System.out.println("EEE - Student Department invoked from Student Class");
	}
	public void studentId()
	{
		System.out.println("S123 - Student ID invoked from Student Class");
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}
}
