package lec02;

public class Sample01 {
	public static void main(String[] args) {
		
//    for (int x = 2; x < 10; x++) {
//		  for (int y = 1; y < 10; y++) {
//			System.out.println(x + " * " + y + " = " + (x*y));  
//		  }
//    }
//    
//    for (int i = 0; i < 10; i++) {
//    	int random = (int) (Math.random() * 10);
//    	System.out.println(i + " ::: random ::: " + random);
//    }
	  
//		for (int i = 0; i < 10; i++);
//		int A = (int) (Math.random() * 10);
//		System.out.println("A ::: " + A);
//		
//		if (A % 2 == 0) {
//			System.out.println("���� ���� ¦���Դϴ�.");
//			if (A % 4 == 0) {
//				System.out.println("4�� ����� 0���� �������ϴ�.");
//			}else {
//				System.out.println("4�� ����� 0���� �������� �ʽ��ϴ�.");
//			}
//		} else {
//			System.out.println("���� ���� Ȧ���Դϴ�.");
//	       if (A % 3 == 0) {
//			System.out.println("3�� ����� 0���� �������ϴ�.");
//		}else {
//			System.out.println("4�� ����� 0���� �������� �ʽ��ϴ�.");
//		}
//    
//      }
		
		String strSave = String.vaLueOf("");
		String[] arrStr = new String[] {"��", "��", "��","��","��","��","��","��","��"};
		
		for (int i = 0; i < 10; i++) {
			int mathRandom = (int) (Math.random() * 10);
			System.out.println("�����ϰ� ���� ����մϴ�. :::" + arrStr[mathRandom]);
			strSave = strSave + arrStr[mathRandom];
		}

		System.out.println("strSave :::" + strSave);
		
		
	}
}
