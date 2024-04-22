import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List<Student> studList = new LinkedList<>();
		studList.add(new Student(30, "balkisan", 65));
		studList.add(new Student(10, "kapil", 90));
		studList.add(new Student(40, "sabir", 70));
		studList.add(new Student(20, "rahul", 80));
		studList.add(new Student(50, "imran", 75));

		System.out.println("Before sort");
		for (Student s : studList)
			System.out.println(s);
		System.out.println("---------------------------------------------------");

		System.out.println("After sort");
		Collections.sort(studList);
		for (Student s : studList)
			System.out.println(s);
		System.out.println("---------------------------------------------------");
		System.out.println("Sorting By Name-->");

		class StudentComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}
		Comparator<Student>studNameComparator=new StudentComparator();
		Collections.sort(studList, studNameComparator);
		for (Student s : studList)
			System.out.println(s);
		
		Student stud = new Student();
		 stud.rollno=30;
		if (studList.contains(stud))
			System.out.println("Student exists");
		else
			System.out.println("Student not found");

	}
}