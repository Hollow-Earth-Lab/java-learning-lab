/**
 * 
 */

/**
 * @author User
 *
 */
public class UsingElseIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReportCard myReportCard = new ReportCard();
		
		System.out.println(myReportCard.convertGrade(95));
		System.out.println(myReportCard.convertGrade(85));
		System.out.println(myReportCard.convertGrade(75));
		System.out.println(myReportCard.convertGrade(65));
		
		
		ReportCard rc = new ReportCard();
		char yourGrade;
		yourGrade = rc.convertGrade(88);
		System.out.println("���� ������ ������ " + yourGrade);
		switch (yourGrade){
		case 'A':
		System.out.println("������������ ������!");
		break;
		case 'B':
		System.out.println("������� ������!");
		break;
		case 'C':
		System.out.println("���� ��������� ������!");
		break;}

		yourGrade = rc.convertGrade(79);
		System.out.println("���� ������ ������ " + yourGrade);
		switch (yourGrade){
		case 'A':
		System.out.println("������������ ������!");
		break;
		case 'B':
		System.out.println("������� ������!");
		break;
		case 'C':
		System.out.println("���� ��������� ������!");
		break;}

	}

}
