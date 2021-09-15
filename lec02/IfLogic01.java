package lec02;

public class IfLogic01 {
	
public static void main(String [] args) {

	if (true) {
		System.out.println("true입니다.");
	}
	if (false) {
		System.out.println("false입니다.");
	}
	
	if (true) {
		System.out.println("ifelse true입니다.");
	} else if (false) {
		System.out.println("ifelse false입니다.");
	}
	
	int paramA = 1;
	if (paramA == 2) {
		System.out.println("첫 번째 if입니다.");
	} else if (paramA == 1) {
		System.out.println("두 번째 else입니다.");
	}
	
	int paramB = 1;
	if (paramB == 1) {
		System.out.println("첫 번째 if입니다.");
	} else if (paramB == 1) {
		System.out.println("두 번째 else입니다.");
	}
	
	int paramC = 1;
	if (paramC == 2) {
		System.out.println("param는 2");
	} else if (paramC == 3) {
		System.out.println("param는 3");
	} else {
		System.out.println("param는 2");
	}
	
	int productionRatio = 30;
	
	if (productionRatio > 70) {
		System.out.println("생산율이 양호합니다.");
	} else {
		System.out.println("생산율이 저조합니다.");
	}
	
	int paramD = 1;
	if (paramD == 2) {
		System.out.println("아무 것도... paramD는 2입니다.");
	} else if (paramD == 3) {
		System.out.println("아무 것도... paramD는 3입니다.");
	}
  }
}