package test;

public class Course {
	
	private String CourseName;
	private String CourseID;
	private float CourseCredit;
	@Override
	public String toString() {
		return "Course [CourseName=" + CourseName + ", CourseID=" + CourseID + ", CourseCredit=" + CourseCredit + "]";
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourseID() {
		return CourseID;
	}
	public void setCourseID(String courseID) {
		CourseID = courseID;
	}
	public float getCourseCredit() {
		return CourseCredit;
	}
	public void setCourseCredit(float courseCredit) {
		CourseCredit = courseCredit;
	}
	public Course(String courseName, String courseID, float courseCredit) {
		super();
		CourseName = courseName;
		CourseID = courseID;
		CourseCredit = courseCredit;
	}
	

}
