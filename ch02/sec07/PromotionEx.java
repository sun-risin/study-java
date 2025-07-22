package ch02.sec07;

public class PromotionEx {
    public static void main(String[] args) {
        
		// byte < short, char < int < long < float < double
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		//char 타입 경우 int 타입으로 자동 변환시 유니코드 값이 저장됨
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		//byte는 음수를 포함하므로 음수를 포함하지 않는 char로는 자동변환이 불가하다
		/*
		 byte byteValue = 65;
		 char charValue = byteValue;
		 
		 이렇게 하면 컴파일 에러가 남.
		 */
    }
}

/*
허용 범위가 다른 변수들
    더 큰 허용범위에 작은 허용 범위를 대입 시, 큰 허용 범위로 자동 변환돼 저장
    (큰 허용 범위 = 작은 허용 범위 => 큰 허용 범위)

    byte < short, char < int < long < float < double

    char 타입
        int 타입에 대입되면 자동 변환 시 유니코드 값이 저장됨
        byte 타입을 대입하려 하면 컴파일 에러. (byte는 음수 있음)
*/