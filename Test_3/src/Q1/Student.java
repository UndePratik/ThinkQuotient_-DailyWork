package Q1;

public class Student {
	private int studentId;
	private String studentName;
	private int studentAge;
	private float studentMarks;
	private static int count=0;
	
	public Student() {
		
	}

	public Student(int studentId, String studentName, int studentAge, float studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
		count++;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}
	public static int getCount() {
        return count;
    }
	
	public String toString()
	{
		return "student Details : "+studentId+" "+studentName+" "+studentMarks+" "+studentAge;
	}
	
}
