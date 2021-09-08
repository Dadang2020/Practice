package lec01;

public class PrimitiveType04 {

	public static void main(String[] args) {
	
		boolean isTrue = false;
		
		char oneChar = '°¡';
		char twoChar = '³ª';
		System.out.println("OT :::: " + oneChar + twoChar);
		
		byte firstByte    = 1;
		short secondShort = 2;
		int thirdInt      = 3;
		long forthLong    = 4;
		long BSIL = firstByte + secondShort + thirdInt + forthLong;
		System.out.println("BSIL :::: " + BSIL);
		
		int frontData = 2;
		int backData  = 3;
		int multipleData = frontData * backData;
		System.out.println("multipleData ::: " + multipleData);
		
		int intA   = 0;
		long longB = 201;
		//int intAlongB = intA + longB;
		long intAlongB  = intA + longB;
		
		float floatA   = 10.1f;
		double doubleB = 20.2;
		double dfAB = floatA + doubleB;
		System.out.println("dfAB ::: " + dfAB);
		
		
	}
}
