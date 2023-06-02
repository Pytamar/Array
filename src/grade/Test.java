package grade;

public class Test {

	public static void main(String[] args) {
		int[] gradesArray = {87, 68, 45, 90, 56, 77, 21, 32, 45, 78, 90};
		
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
		System.out.printf("Welcome to the Grade Book for%n%s%n%n", myGradeBook.getCourseName());
		myGradeBook.processGrades();

	}

}
