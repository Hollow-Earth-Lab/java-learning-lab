/**
 * 
 */

/**
 * @author User
 *
 */
public class ReportCard {
	
	
	public char convertGrade(int testResult) {
	
		char grade;
		
		if (testResult >= 90) {
			grade = 'A';
		} else if (testResult >= 80) {
			grade = 'B';
		} else if (testResult >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		return grade;
	}

}
