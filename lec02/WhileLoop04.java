package lec02;

public class WhileLoop04 {

	public static void main(String[] args) {
	
//	int whileCnt = 0;
//	while (whileCnt < 10) {
//	       whileCnt++;
//	       System.out.println("whileCnt ::: " + whileCnt);  
//	}
//	
//	int whileCnt = 0;
//	boolean isTrue = true;
//	
//	while (isTrue) {
//		whileCnt++;
//		System.out.println("if WhileCnt" + whileCnt);
//		if (whileCnt == 10) {
//			break;
//		}
//	}

    for (int i = 0; i < 10; i++) {
    	if (i % 3 == 0) {
    		continue;
    	}
    	System.out.println(i);
    }
		
		
  }
}
