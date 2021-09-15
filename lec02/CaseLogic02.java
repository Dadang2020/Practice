package lec02;

public class CaseLogic02 {
	
	public static void main(String[] args) {
	
		int paramA = 1;
		
		switch (paramA) {
		case 0 :
		    System.out.println("0입니다.");
		    break;
		case 1 :
		    System.out.println("1입니다.");
		    break;
		case 2 :
			System.out.println("2입니다.");
			break;
		case 3 :
		    System.out.println("3입니다.");
		    break;
		case 4 :
		    System.out.println("4입니다.");
		    break;
		}
		
       int intParamA = 9;
		
		switch (intParamA) {
		case 0 :
		    System.out.println("intParamA는 0입니다.");
		    break;
		case 1 :
		    System.out.println("intParamA는 1입니다.");
		    break;
		case 2 :
			System.out.println("intParamA는 2입니다.");
			break;
		case 3 :
		    System.out.println("intParamA는 3입니다.");
		    break;
		case 4 :
		    System.out.println("intParamA는 4입니다.");
		    break;
		case 5 :
		    System.out.println("intParamA는 5입니다.");
		    break;
		    default:
		    	System.out.println("intParamA는 default입니다.");
		    	break;
		}
		
		
	}
}
