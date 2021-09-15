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
//			System.out.println("랜덤 값은 짝수입니다.");
//			if (A % 4 == 0) {
//				System.out.println("4로 나누어서 0으로 떨어집니다.");
//			}else {
//				System.out.println("4로 나누어서 0으로 떨어지지 않습니다.");
//			}
//		} else {
//			System.out.println("랜덤 값은 홀수입니다.");
//	       if (A % 3 == 0) {
//			System.out.println("3로 나누어서 0으로 떨어집니다.");
//		}else {
//			System.out.println("4로 나누어서 0으로 떨어지지 않습니다.");
//		}
//    
//      }
		
		String strSave = String.vaLueOf("");
		String[] arrStr = new String[] {"가", "나", "디","라","마","바","사","아","자"};
		
		for (int i = 0; i < 10; i++) {
			int mathRandom = (int) (Math.random() * 10);
			System.out.println("랜덤하게 값을 출력합니다. :::" + arrStr[mathRandom]);
			strSave = strSave + arrStr[mathRandom];
		}

		System.out.println("strSave :::" + strSave);
		
		
	}
}
