public class SwitchOperatorAndDecisionMaking {
    
	public static void main(String[] args) {
        ReportCard rc = new ReportCard();

        char yourGrade = rc.convertGrade(75);

        switch(yourGrade){
            case 'A':
                System.out.println("������������ ������!");
                break;
            
            case 'B':
                System.out.println("������� ������!");
                break;

            case 'C':
                System.out.println("���� ��������� ������!");
                break;
                
            case 'D':
                System.out.println("������ �����������!");
                break;
        }
        
    }

}
