package lec02;

public class ForLoop03 {

	public static void main(String[] args) {
		
//		for (int i = 0; i <5; i++) {
//			System.out.println("i는" + i + "입니다.");
//		}
//		
//		int whilCnt = 0;
//		while (whilCnt < 5) {
//			System.out.println("반목문++ : " + whilCnt++ +"입니다.");
//		}
//		
//		whilCnt = 0;
//		while (whilCnt < 5) {
//			System.out.println("++반목문 : " + ++whilCnt +"입니다.");
//		}
//		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("1부터..." + i + "입니다.");
//		}
//		
//		ArrayList<String> strList = new ArrayList<>();
//		strList.add("총무부");
//		strList.add("회계부");
//		strList.add("재무부");
//    	strList.add("기획부");
//		strList.add("인사부");
//		
//		for (String dep : strList) {
//			System.out.println("부서 : " + dep);
//    	}
//		
//		for (int i = 10; i > 0; i--); {
//			System.out.println("i는" + i + "입니다.");
//		}
//		
//		for(int i = 10; i > 0; i-=2) {
//			System.out.println("i는 -=2 ::: " + i);
//		}

        for (int x = 2; x < 10; x++) {
		  for (int y = 1; y < 10; y++) {
			System.out.println(x + "단 : " + x + " X " + y + " = " + (x*y));  
		  }
	}
  }
}
