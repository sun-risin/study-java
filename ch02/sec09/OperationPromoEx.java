package ch02.sec09;

public class OperationPromoEx {
    public static void main(String[] args) {

		byte res1 = 10 + 20; //컴파일 단계에서 연산
		System.out.println("res1: " + res1);
		

        // int 타입보다 작은 타입들로 연산한 값으로 초기화 시
		byte v1 = 10;
		byte v2 = 20;
		int res2 = v1 + v2; // 각각 int 타입으로 변환되어 연산

		char v6 = 'A';
		char v7 = 1;
		int res4 = v6+ v7; // int 타입으로 변환되어 연산

        System.out.println("res2: " + res2);
		System.out.println("res4: " + res4);
		System.out.println("res4: " + (char)res4); // 글자로 출력, 강제 타입 변환
		
		
		
		// long 사용됨
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long res3 = v3 + v4 + v5;
		System.out.println("res3: " + res3);
		
		
		// 실수의 경우
		float a1 = 1.2f;
		double a2 = 3.4;
		double res = a1 + a2; //float가 double로 변환되어 연산
        System.out.println("res: " + res);
	
		
		// int와 double 연산하는 경우
		int v9 = 10;
		double res6 = v9 / 4.0; //double로 변환후 연산
		System.out.println("res6: " + res6);
		
		int res6_1 = v9 / (int) 4.0; //double을 강제변환하여 int로 저장할 수 있음
		System.out.println("res6_1: " + res6_1);
		
		
		// 정수 연산 값을 실수 타입으로 저장하기 
		int v8 = 10;
		int res5 = v8 / 4; //정수 연산이므로 결과는 정수.
		System.out.println("res5: " + res5);
		
		int v10 = 1;
		int v11 = 2;
		double res7 = (double) v10 / v11; // 강제 타입 변환 후 연산하였으므로 하나 이상이 실수, double로 저장됨.
		System.out.println("res7: " + res7);
    }
}

/*
리터럴 연산으로 변수 초기화
    컴파일 단계에서 연산 수행 => 실행 시 연산을 없애 성능 높임

변수 간 연산으로 변수 초기화
    실행 시 연산 수행

    정수의 경우, int타입으로 자동 타입 변환되어 연산 수행
        피연산자 타입이 int보다 작을 때 (type, char) : int로 저장
        피연산자 중 long이 있을 때 : long으로 저장

    실수의 경우, double로 자동 타입 변환되어 연산 수행
        피연산자 중 float가 있을 때 : double로 저장

    정수(int)와 실수(double) 연산 있을 경우, int 타입이 double로 자동변환됨
        double로 저장
        int로 저장? : double 변수를 강제 변환한 연산식 사용해야 함 

    정수끼리 연산 후 실수(double)로 저장하고 싶은 경우,
        자바에서 정수 연산의 결과는 항상 정수.
        하나이상 실수타입으로 강제변환하여 써야 함 => 정수와 실수 연산이 됨
        변환 안 하면 당연히 컴파일 에러 남...
        
        (double) (연산식) 이런 식으로 강제 변환은 X
            : 연산 후 변환이라 의미가 없다
*/
