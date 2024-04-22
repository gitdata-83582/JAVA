
public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int marks;

	public Student() {

	}

	public Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student ( rollno=" + rollno + ", name=" + name + ", marks=" + marks + ")";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj instanceof Student) {
			Student e = (Student) obj;
			return e.rollno == this.rollno;
		}
		return false;
	}

}
