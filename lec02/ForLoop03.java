package lec02;

public class ForLoop03 {

	public static void main(String[] args) {
		
//		for (int i = 0; i <5; i++) {
//			System.out.println("i��" + i + "�Դϴ�.");
//		}
//		
//		int whilCnt = 0;
//		while (whilCnt < 5) {
//			System.out.println("�ݸ�++ : " + whilCnt++ +"�Դϴ�.");
//		}
//		
//		whilCnt = 0;
//		while (whilCnt < 5) {
//			System.out.println("++�ݸ� : " + ++whilCnt +"�Դϴ�.");
//		}
//		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("1����..." + i + "�Դϴ�.");
//		}
//		
//		ArrayList<String> strList = new ArrayList<>();
//		strList.add("�ѹ���");
//		strList.add("ȸ���");
//		strList.add("�繫��");
//    	strList.add("��ȹ��");
//		strList.add("�λ��");
//		
//		for (String dep : strList) {
//			System.out.println("�μ� : " + dep);
//    	}
//		
//		for (int i = 10; i > 0; i--); {
//			System.out.println("i��" + i + "�Դϴ�.");
//		}
//		
//		for(int i = 10; i > 0; i-=2) {
//			System.out.println("i�� -=2 ::: " + i);
//		}

        for (int x = 2; x < 10; x++) {
		  for (int y = 1; y < 10; y++) {
			System.out.println(x + "�� : " + x + " X " + y + " = " + (x*y));  
		  }
	}
  }
}
