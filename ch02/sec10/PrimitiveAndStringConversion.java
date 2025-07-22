package ch02.sec10;

public class PrimitiveAndStringConversion {
    public static void main(String[] args) {

        // 문자열을 기본타입으로 변환하는 방법
		
		//(1) String -> byte
		byte v1 = Byte.parseByte("10");
		
		//(2) String -> short
		short v2 = Short.parseShort("200");
		
		//(3) String -> int
		int v3 = Integer.parseInt("300000");
		
		//(4) String -> long
		long v4 = Long.parseLong("4000000000000");
		
		//(5) String -> float
		float v5 = Float.parseFloat("12.345");
		
		//(6) String -> double
		double v6 = Double.parseDouble("12.345");
		
		//(7) String -> boolean
		boolean v7 = Boolean.parseBoolean("true");
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println("v5: " + v5);
		System.out.println("v6: " + v6);
		System.out.println("v7: " + v7);
		
		// String.valueOf()메소드 
		String str1 = String.valueOf(v1);
		String str2 = String.valueOf(v2);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
    }
}

/*

기본 타입 -> String
    기본타입 변수 = 기본타입.parse기본타입(문자열);
    (ex) byte v1 = Byte.parseByte("12");

String -> 기본 타입 : String.valueOf()메소드 이용

*/