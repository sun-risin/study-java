package ch02.sec04;

public class ActualNum {
    public static void main(String[] args) {

		//f나 F를 붙여 float임을 표시
		float var1 = 0.1234567890123456789f; //0.12345679로 뜸. (반올림)
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6; //3000000
		float var4 = 3e6F; //3000000
		double var5 = 2e-3; //0.002
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
    }
}

/*
실수 타입 -> float, double
    범위, 정밀도 : float < double
        float에서 다 표현되지 못하는 뒷자리는 반올림되어 저장

    컴파일러가 기본적으로 double타입으로 해석 => f나 F로 float임을 표시

10의 거듭제곱 리터럴
    자바가 저장하는 방식인 부동 소수점 방식 따름
		: 부호 가수 * 10^지수 => 부호가수e(E)지수
		    정수 다음에는 e를, 외에는 E를 붙여 표시함
		        -> ex1: 5e2 = 500, ex2: 0.12E-2 = 0.0012
*/