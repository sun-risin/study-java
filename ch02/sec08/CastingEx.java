package ch02.sec08;

public class CastingEx {
    public static void main(String[] args) {
        
		//(ex1) int -> byte
		int var1 = 10;
		byte var2 = (byte) var1; //강제 타입 변환, 앞 3byte가 삭제되고 끝 1byte 값만 저장됨
		System.out.println(var2);
		//강제 타입 변환 후에도 값이 보존된 채 저장됨. (byte 범위를 넘긴 값은 보존되지 못한 채 저장됨)
		
		
		//(ex2) long -> int
		long var3 = 300;
		int var4 = (int) var3; //강제 타입 변환 후에도 값이 보존되어 저장되었음
		System.out.println(var4);
		
		
		//(ex3) int -> char
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6); //'A'가 출력됨. char 허용범위 내의 단어만 보존되어 출력가능
		
		
		//(ex4) double -> int (실수 -> 정수)
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8); //3이 출력됨, 즉 소수점 이하 부분은 버려짐
    }
}

/* 
큰 -> 작은으로 자동 타입 변환은 불가 (큰 그릇을 작은 그릇에 못 넣듯)


강제 타입 변환 == 캐스팅 (casting)
    큰 허용 범위 타입을 작은 허용 범위 타입 단위로 쪼개어 저장
    범위를 넘긴 값이나 형태가 안 맞는 부분은 보존되지 않음 (버려짐)
        이상이 없으면 보존된 채 저장됨!

    캐스팅 연산자 : 소괄호 (). 안에 들어가는 타입이 쪼개는 단위
        ex: 작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입
*/