package lec02;

public class IfLogic01 {
	
public static void main(String [] args) {

	if (true) {
		System.out.println("true�Դϴ�.");
	}
	if (false) {
		System.out.println("false�Դϴ�.");
	}
	
	if (true) {
		System.out.println("ifelse true�Դϴ�.");
	} else if (false) {
		System.out.println("ifelse false�Դϴ�.");
	}
	
	int paramA = 1;
	if (paramA == 2) {
		System.out.println("ù ��° if�Դϴ�.");
	} else if (paramA == 1) {
		System.out.println("�� ��° else�Դϴ�.");
	}
	
	int paramB = 1;
	if (paramB == 1) {
		System.out.println("ù ��° if�Դϴ�.");
	} else if (paramB == 1) {
		System.out.println("�� ��° else�Դϴ�.");
	}
	
	int paramC = 1;
	if (paramC == 2) {
		System.out.println("param�� 2");
	} else if (paramC == 3) {
		System.out.println("param�� 3");
	} else {
		System.out.println("param�� 2");
	}
	
	int productionRatio = 30;
	
	if (productionRatio > 70) {
		System.out.println("�������� ��ȣ�մϴ�.");
	} else {
		System.out.println("�������� �����մϴ�.");
	}
	
	int paramD = 1;
	if (paramD == 2) {
		System.out.println("�ƹ� �͵�... paramD�� 2�Դϴ�.");
	} else if (paramD == 3) {
		System.out.println("�ƹ� �͵�... paramD�� 3�Դϴ�.");
	}
  }
}